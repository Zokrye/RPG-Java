/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.*;
/**
 *
 * @author alexa
 */
public abstract class Personnage {
    List<Objet> inventaire = new ArrayList<>();
    //Equipement[] inventaire;
    Statistiques stats_perso;
    
    public Personnage(Statistiques stats) {
        this.stats_perso=stats;
        //this.inventaire=new Equipement[5];
    }
    
    public abstract String attaquer();
}
