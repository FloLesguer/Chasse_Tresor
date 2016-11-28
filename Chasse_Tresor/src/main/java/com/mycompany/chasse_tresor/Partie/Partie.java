package com.mycompany.chasse_tresor.Partie;

/**
 * Created by flesguer on 27/11/2016.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.chasse_tresor.Entities.Carte;
import com.mycompany.chasse_tresor.Util.Ligne;

import java.io.*;



@SuppressWarnings("Duplicates")
public class Partie{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
            FileInputStream fstream = new FileInputStream("fichierCarte.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null)   {
                String[] tokens = strLine.split(" ");

                Ligne ligne = new Ligne(tokens[0],tokens[1],tokens[2]);//process record , etc

                if (ligne.valeur1.equals("C")){
                       Carte carte = new Carte(Integer.parseInt(ligne.valeur2), Integer.parseInt(ligne.valeur3));

                        //System.out.println("La carte fait une taille de "+ToInt(ligne.valeur2)+ " par "+ToInt(ligne.valeur3));
                        System.out.println("La carte fait une taille de "+Integer.parseInt(ligne.valeur2)+ " par "+Integer.parseInt(ligne.valeur3));
                }

                if (ligne.valeur1.equals("T")){

                    System.out.println("Il y a "+ligne.valeur3 + " tresor(s) à l'emplacement " +ligne.valeur2);
                }

                System.out.println(ligne.valeur1 + ligne.valeur2 + ligne.valeur3);

            }
            in.close();
        }
        catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static int ToInt(String substring) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}