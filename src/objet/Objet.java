package objet;

import vaisseau.Vaisseau;

public abstract class Objet {
    private String nom;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract void utiliser(Vaisseau vaisseau);
}
