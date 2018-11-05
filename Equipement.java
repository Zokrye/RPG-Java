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
public class Equipement {
    final Statistiques stats_objet;
    final String nom;
    final String type;

    public Equipement(Statistiques stats, String nom, String type) {
    this.stats_objet=stats;
    this.nom=nom;
    this.type=type;
}
}
