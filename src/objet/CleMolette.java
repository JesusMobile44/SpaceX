package objet;

import vaisseau.Vaisseau;

public class CleMolette extends Objet { // petit
    public CleMolette() {
        setNom("Clé à Molette");
    }

    public void utiliser(Vaisseau vaisseau){
        System.out.println("Vous frapper le moteur et vous regagnez une petite quantité de points de vies");
        vaisseau.setVie(vaisseau.getVie()+25);
    }
}
