package main;

import vaisseau.Vaisseau;

import java.util.Scanner;
import java.util.Stack;

import planete.*;
import vaisseau.*;
import objet.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Vaisseau vaisseau = new Vaisseau();
    public static Planete[] listePlanete = new Planete[5];
    public static void main(String[] args) {
        try{
            start();
            while(true){
                executer(choix());
            }
        }
        catch(Exception exception){
            System.out.println("It dont work");
            System.out.println("ono");
            System.exit(0);
        }
    }
    public static int choix(){
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
    public static void executer(int choix){
        switch(choix){
            case 1:
                examiner();
                break;
            case 2:
                explorer();
                break;
            case 3:

                break;
            case 4:

                break;
            default:


        }
    }
    public static void examiner(){
        System.out.println("État du vaisseau :");
        System.out.println("    Planète courante : "+vaisseau.getTrajet().peek().getNom());
        System.out.println("    Quantité carburant : "+vaisseau.getCarburant());
        System.out.println("    Points de vie : "+vaisseau.getVie());
        System.out.println("    Inventaire : ");
        for (int i=0;i<vaisseau.getInventaire().size();i++){
            System.out.println("        - "+vaisseau.getInventaire().get(i).getNom());
        }
        System.out.println();
    }
    public static void explorer(){
        listePlanete[(int)(Math.random()*5)].explorer(vaisseau);
        System.out.println();
    }
    public static void start(){
        System.out.println("Bienvenue dans Space explorer!");
        System.out.println();
        listePlanete[0] = new Badabing();
        listePlanete[1] = new Badaboom();
        listePlanete[2] = new Gelinium();
        listePlanete[3] = new Ibarium();
        listePlanete[4] = new Venus();
    }
    public static void fin(){
        System.out.println("");
        int size = vaisseau.getTrajet().size();
        Stack<Planete> listeInverse = new Stack<>();
        for (int i=0;i<size;i++){
            listeInverse.push(vaisseau.getTrajet().pop());
        }
        System.out.print("Trajet ===> ");
        for (int i=0;i<size;i++){
            System.out.print(listeInverse.pop().getNom()+" > ");
        }
        System.exit(0);
    }
}
