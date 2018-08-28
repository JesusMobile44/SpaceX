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

    public Vaisseau() {
        this.carburant = 1000;
        this.vie = 100;
        this.inventaire = new ArrayList<>();
        this.trajet = new Stack<>();
        trajet.push(new Terre());
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
