package planete;
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

    public abstract void explorer(Vaisseau vaisseau);
}
