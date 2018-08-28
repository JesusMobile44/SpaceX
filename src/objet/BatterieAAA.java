package objet;

import vaisseau.Vaisseau;

public class BatterieAAA extends Objet { //petit
    public BatterieAAA() {
        setNom("Batterie AAA");
    }
    public void utiliser(Vaisseau vaisseau){
        System.out.println("La batterie donne une petite quantité d'énergie à votre vaisseau");
        vaisseau.setCarburant(vaisseau.getCarburant()+250);
    }
}
