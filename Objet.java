/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author burak
 */
public class Objet {
    String nom;
    String type;
    Statistiques bonus_objet;
    
    public Objet (String nom,String type, Statistiques bonus_objet){
        this.nom = nom;
        this.type = type;
        this.bonus_objet = bonus_objet;
    }
}
