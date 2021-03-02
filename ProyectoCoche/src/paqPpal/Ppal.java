/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqPpal;

import paqCoche.Coche;

/**
 *
 * @author Profesor
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*
        Coche lere=new Coche(3,"MANUAL","DIESEL");
       System.out.println("Coche lere= "+lere);
       
       Coche manolito=new Coche(5,"AUTOMATICO","GASOLINA");
        System.out.println("Coche manolito="+manolito);
        
       Coche.setDuenio("Pedro");
        System.out.println("lere ="+lere);
        System.out.println("manolito="+manolito);
        */
      
        Coche cintia=null; 
        try{
         cintia=new Coche(2,"mmMANUAL","DIESEL");
         System.out.println("cintia = "+cintia);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("cintia="+cintia);
        
      /*  
       try{
           lere.setPuertas(8);
       }
       catch(IllegalArgumentException e){
           System.out.println("Error, te has equivocado, número de puertas entre 3 y 5");
       }
       
       try{
           lere.setCambio("MIGUEL");
       }catch(IllegalArgumentException e)
       {
           System.out.println(e.getMessage());
       }
       
       try{
           lere.setCombustible("SDF");
       }catch(IllegalArgumentException e)
       {
           System.out.println(e.getMessage());
       }
       */
        
    }
    
}
