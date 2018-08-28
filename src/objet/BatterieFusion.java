package objet;
import vaisseau.Vaisseau;

public class BatterieFusion extends Objet { //gros
    public BatterieFusion() {
        setNom("Batterie à Fusion");
    }
    public void utiliser(Vaisseau vaisseau){
        System.out.println("La batterie donne une grande quantité d'énergie à votre vaisseau");
        vaisseau.setCarburant(vaisseau.getCarburant()+500);
    }
}
