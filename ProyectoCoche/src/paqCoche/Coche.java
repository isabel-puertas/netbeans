/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqCoche;

/**
 *
 * @author Profesor
 */
public class Coche {
    private int puertas;
    private String cambio, combustible;
    private final static String[] tipo={"DIESEL","GASOLINA","HIBRIDO","ELECTRICO"};
    private static String duenio; 
    
    public Coche(int puertas, String cambio, String combustible) throws IllegalArgumentException
    {        
        String nvCambio=cambio.trim().toUpperCase();
        if (nvCambio!="MANUAL" && nvCambio!="AUTOMATICO" )
            throw new IllegalArgumentException("Cambio erróneo");
        
        if (puertas<3 || puertas>5)
            throw new IllegalArgumentException("Número de puertas incorrecto");
        
        
        this.puertas = puertas;
        this.cambio = cambio;
        this.combustible = combustible;
        
    }    

    public static String getDuenio() {
        return Coche.duenio;
    }

    public static void setDuenio(String duenio) {
        Coche.duenio = duenio;
    }

    
    public static String[] getTipo() {
        return Coche.tipo;
    }
    
    
    public void setPuertas(int puertas) throws IllegalArgumentException
    {
        if (puertas<3 || puertas>5)
        {
            IllegalArgumentException ex=new IllegalArgumentException();
            throw ex;
        }  
        else
          this.puertas = puertas;
    }

    public void setCambio(String cambio) throws IllegalArgumentException
    {
        String nvCambio=cambio.trim().toUpperCase();
        if (nvCambio.equals("MANUAL") || nvCambio.equals("AUTOMATICO"))
        {            
          this.cambio = cambio;
        }
        else
            throw new IllegalArgumentException("Fuensanta te has equivado");
    }

    public void setCombustible(String combustible) throws IllegalArgumentException 
    {
        String nvCombustible=combustible.trim().toUpperCase();
        boolean encontrado=false;
        for (int i = 0; i < Coche.tipo.length; i++) {
            if (nvCombustible==Coche.tipo[i])
            {    
                encontrado=true;
                this.combustible = combustible;
                break;
            }    
        }
        
        if (!encontrado)
            throw new IllegalArgumentException("Combustible erróneo");
        /*
        if (!nvCombustible.equals("DIESEL") && !nvCombustible.equals("GASOLINA") && !nvCombustible.equals("HIBRIDO") && !nvCombustible.equals("ELECTRICO") )
            throw new IllegalArgumentException("Combustible erróneo");
        */
        //if (encontrado==true)
        
    }
   
    
    public int getPuertas() {
        return this.puertas;
    }

    public String getCambio() {
        return this.cambio;
    }

    public String getCombustible() {
        return this.combustible;
    }

    @Override
    public String toString() {
        return "{" + "Puertas=" + this.puertas + ", Cambio=" + this.cambio + ", Combustible=" + this.combustible + ", Dueño: "+duenio+'}';
    }
    
    
}
