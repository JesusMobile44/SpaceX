package vaisseau;
import objet.Objet;
import planete.Planete;
import planete.Terre;

import java.util.ArrayList;
import java.util.Stack;

public class Vaisseau {
    int carburant;
    int vie;
    Stack<Planete> trajet;
    ArrayList<Objet> inventaire;
    Vaisseau vaisseauBack;

    public Vaisseau() {
        this.carburant = 1000;
        this.vie = 100;
        this.inventaire = new ArrayList<>();
        this.trajet = new Stack<>();
        trajet.push(new Terre());
        this.vaisseauBack = null;
    }
    public Vaisseau(Vaisseau vaisseau){
        this.carburant = vaisseau.carburant;
        this.vie = vaisseau.vie;
        this.inventaire = new ArrayList<>();
        for (int i=0;i<vaisseau.getInventaire().size();i++){
            this.inventaire.add(vaisseau.getInventaire().get(i));
        }
        int size = vaisseau.getTrajet().size();
        ArrayList<Planete> arrayBackup = new ArrayList<>();
        for (int i=0;i<size;i++){
            arrayBackup.add(vaisseau.getTrajet().pop());
        }
        this.trajet = new Stack<>();
        for (int i=size-1;i>=0;i--){
            vaisseau.getTrajet().push(arrayBackup.get(i));
            this.trajet.push(arrayBackup.get(i));
        }
    }

    public Vaisseau getVaisseauBack() {
        return vaisseauBack;
    }

    public void setVaisseauBack(Vaisseau vaisseauBack) {
        this.vaisseauBack = vaisseauBack;
    }

    public Stack<Planete> getTrajet() {
        return trajet;
    }

    public void setTrajet(Stack<Planete> trajet) {
        this.trajet = trajet;
    }

    public int getCarburant() {
        return carburant;
    }

    public void setCarburant(int carburant) {
        this.carburant = carburant;
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public ArrayList<Objet> getInventaire() {
        return inventaire;
    }

    public void setInventaire(ArrayList<Objet> inventaire) {
        this.inventaire = inventaire;
    }
}
