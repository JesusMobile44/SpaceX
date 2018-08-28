package planete;

import main.Main;
import objet.*;
import vaisseau.Vaisseau;

public abstract class Planete {
    private String nom = "";
    private int cout = 0;
    private int chancePirate = 0;

    public int getChanceObjet() {
        return chanceObjet;
    }

    public void setChanceObjet(int chanceObjet) {
        this.chanceObjet = chanceObjet;
    }

    private int chanceObjet = 0;

    public int getChancePirate() {
        return chancePirate;
    }

    public void setChancePirate(int chancePirate) {
        this.chancePirate = chancePirate;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public void explorer(Vaisseau vaisseau){
        vaisseau.getTrajet().push(this);
        vaisseau.setCarburant(vaisseau.getCarburant()-cout);
        if (vaisseau.getCarburant()<=0){
            System.out.println("Vous êtes à cours d'essence.");
            Main.fin();
        }
        if ((int)(Math.random()*100)<chancePirate){
            System.out.println("Des pirates de l'espace vous attaquent !");
            System.out.println("Votre vaisseau perd 25 point de vie !");
            vaisseau.setVie(vaisseau.getVie()-25);
            if (vaisseau.getVie()<=0){
                System.out.println("Vous n'avez plus de vie.");
                Main.fin();
            }
        }
        if ((int)(Math.random()*100)<chanceObjet){
            vaisseau.getInventaire().add(donnerObjet());
        }
        System.out.println("Vous explorez la planète "+nom+".");
        System.out.println("Vous dépensez "+cout+" litres d'essence.");
    }
    public Objet donnerObjet(){
        int random = (int)(Math.random()*5+1);
        Objet objet;
        switch (random){
            case 1:
                System.out.println("Vous obtenez une Batterie AAA.");
                objet = new BatterieAAA();
                break;
            case 2:
                System.out.println("Vous obtenez une Batterie à Fusion.");
                objet = new BatterieFusion();
                break;
            case 3:
                System.out.println("Vous obtenez une Clé à Molette.");
                objet = new CleMolette();
                break;
            case 4:
                System.out.println("Vous obtenez un Kit de Réparation.");
                objet = new KitReparation();
                break;
            case 5:
                System.out.println("Vous obtenez une Batterie Nucléaire.");
                objet = new BatterieNucleaire();
                break;
            default:
                System.out.println("Vous obtenez une Batterie AAA.");
                objet = new BatterieAAA();
                break;
        }
        return objet;
    }
}
