package vaisseau;
import planete.Planete;
import java.util.Stack;

public class Vaisseau {
    int carburant;
    int vie;
    int tailleInventaire;
    Stack<Planete> trajet;

    public Vaisseau() {
        this.carburant = 1000;
        this.vie = 100;
        this.tailleInventaire = 0;
        this.trajet = new Stack<>();
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

    public int getTailleInventaire() {
        return tailleInventaire;
    }

    public void setTailleInventaire(int tailleInventaire) {
        this.tailleInventaire = tailleInventaire;
    }
}
