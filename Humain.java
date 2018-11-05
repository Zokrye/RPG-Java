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
public class Humain extends Personnage {

    String nom;
    Equipement arme;
    //List<Objet> inventaire = new ArrayList<Objet>();
    
    public Humain(String nom, Statistiques stats) {
        super(stats);
        this.nom=nom;
    }
    
    public void soin(){
        
    }
    public void don(){
        
    }
    public void equiper(String objet){
        
    }
    @Override
    public String attaquer() {
        return "";
    }
}
