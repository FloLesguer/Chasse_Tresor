/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasse_tresor;

import java.util.*;
import java.io.*;
/**
 *
 * @author Baptiste
 */
public class Partie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        File file =new File("fichierCarte.txt");
        Scanner in = null;
        String line = null;
        try {
            in = new Scanner(file);
            while(in.hasNext())
            {
                line=in.nextLine();
                if(line.contains("C "))
                    System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
        
        
        Carte carte = new Carte(ToInt(line.substring(2,1)), ToInt(line.substring(4,1)));
    }

    private static int ToInt(String substring) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
