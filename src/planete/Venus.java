package planete;

import vaisseau.Vaisseau;

public class Venus extends Planete  {
    public Venus() {
        setNom("Venus");
        setCout((int)(Math.random()*40+30));
        setChancePirate(20);
        setChanceObjet(20);
    }
    public void explorer(Vaisseau vaisseau) {

    }
}
