package objet;

import vaisseau.Vaisseau;

public class KitReparation extends Objet { //gros
    public KitReparation() {
        setNom("Kit de Réparation");
    }

    public void utiliser(Vaisseau vaisseau) {
        System.out.println("Vous réparer l'extérieur du vaisseau et regagnez une grande quantité de points de vies");
        vaisseau.setVie(vaisseau.getVie()+50);
    }
}
