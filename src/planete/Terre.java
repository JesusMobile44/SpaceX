package planete;

import vaisseau.Vaisseau;

public class Terre extends Planete {
    public Terre() {
        setNom("Terre");
        setCout((int)(Math.random()*30+20));
        setChancePirate(0);
        setChanceObjet(0);
    }
    public void explorer(Vaisseau vaisseau) {

    }
}
