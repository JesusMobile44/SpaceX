package planete;

import vaisseau.Vaisseau;

public class Badabing extends Planete  {
    public Badabing() {
        setNom("Badabing");
        setCout((int)(Math.random()*30+20));
        setChancePirate(20);
        setChanceObjet(20);
    }

    public void explorer(Vaisseau vaisseau) {
        System.out.println("Vous arrivez sur la planête ");
    }
}
