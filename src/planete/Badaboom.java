package planete;

import vaisseau.Vaisseau;

public class Badaboom extends Planete  {
    public Badaboom() {
        setNom("Badaboom");
        setCout((int)(Math.random()*30+20));
        setChancePirate(20);
        setChanceObjet(20);
    }
    public void explorer(Vaisseau vaisseau) {

    }
}
