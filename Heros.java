/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
//Ceci importe la classe Scanner du package java.util
import java.util.Scanner; 

/**
 *
 * @author alexa
 */
public class Heros extends Humain {
    
    public Heros(String nom, Statistiques stats) {
        super(nom, stats);
        
        
    }
    public void lacher(){
        System.out.print("Voici votre inventaire : ");
        for (int i=0;i<= inventaire.size();i++) {
            System.out.println("("+i+") "+inventaire.get(i).nom);
        }
        System.out.println("Selectionnez un objet en tapant son numéro ou taper r si vous voulez revenir en arrière");
        Scanner sc = new Scanner(System.in);
        String choix_joueur = sc.nextLine();
        if ( choix_joueur .equals('r')){
            System.out.println("Très bien.");
            
        }
        try {
            int cj = Integer.parseInt(choix_joueur);
            if ( cj>=0 && cj< inventaire.size()){
                System.out.println(inventaire.get(cj).nom+".");
                System.out.println("Objet de type "+inventaire.get(cj).type+".");
                System.out.println("ATT : "+inventaire.get(cj).bonus_objet.att+"DEF : "+inventaire.get(cj).bonus_objet.def+"VIT : "+inventaire.get(cj).bonus_objet.vit+"PERCEP : "+inventaire.get(cj).bonus_objet.percep+"DISCRE : "+inventaire.get(cj).bonus_objet.discre);
                System.out.println("Êtes vous sûr ? 1 : oui 2 : non");
                
            }
        }
        catch{
        
        }
        
    }
    public void looter() {test;
        
    }
    public void fuite() {
        
    }
}
