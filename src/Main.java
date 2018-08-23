import vaisseau.Vaisseau;

import java.util.Scanner;
import planete.*;
import vaisseau.*;
import objet.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    Vaisseau vaisseau = new Vaisseau();
    public static void main(String[] args) {
        try{

            System.out.println("Bienvenue dans Space explorer!");
            System.out.println();
            choix();
        }
        catch(Exception exception){
            System.out.println("It dont work");
            System.out.println("ono");
            System.exit(0);
        }
    }
    public static int choix(){
        while(true){
            int action;
            System.out.println("Que désirez-vous faire ?");
            System.out.println("    1-Examiner le vaisseau");
            System.out.println("    2-Explorer une planete");
            System.out.println("    3-Utiliser un objet dans l'inventaire");
            System.out.println("    4-Revenir en arriere");
            try{
                action=sc.nextInt();
                return action;
            }
            catch(Exception numero){
                System.out.println("Entrer un chiffre valide");
                return 0;
            }
        }


    }
    public static void executer(int choix){
        switch(choix){
            case 1:
                examiner();
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:


        }
    }
    public static void examiner(){

    }
}
