/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author alexa
 */
public class PNJ extends Humain {
    final String etat_esprit;

    public PNJ(String nom, Statistiques stats, String etat_esprit) {
        super(nom, stats);
        this.etat_esprit=etat_esprit;
        
    }
    
}
