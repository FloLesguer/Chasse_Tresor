/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasse_tresor;

import java.util.ArrayList;

/**
 *
 * @author flesguer
 */
public class Joueur {

public String identifiant;
public int positionX = 0;
public int positionY = 0;
public ArrayList<String> deplacements;

    public Joueur(String identifiant, ArrayList<String> deplacements) {
        this.identifiant = identifiant;
        this.deplacements = deplacements;
    }

    



}
