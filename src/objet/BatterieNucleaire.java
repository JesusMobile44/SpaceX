package objet;

import main.Main;
import vaisseau.Vaisseau;

public class BatterieNucleaire extends Objet {
    public BatterieNucleaire() {
        setNom("Batterie Nucléaire");
    }
    public void utiliser(Vaisseau vaisseau){
        System.out.println("La batterie est instable et explose votre vaisseau");
        Main.fin();
    }
}
