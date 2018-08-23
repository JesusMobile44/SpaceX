package planete;

import vaisseau.Vaisseau;

public class Gelinium extends Planete  {
    public Gelinium() {
        setNom("Gelinium");
        setCout((int)(Math.random()*50+50));
        setChancePirate(45);
        setChanceObjet(70);
    }
    public void explorer(Vaisseau vaisseau) {

    }
}
