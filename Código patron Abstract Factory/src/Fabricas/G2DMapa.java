/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;

import Metodos.Mapa;

/**
 *
 * @author Usuario
 */
public class G2DMapa implements Mapa{
    
    private final static String MAPA="Dibujar un mapa en 2D";
    
    @Override
    public String nombre() {
        return "Mapa2D";
    }

    @Override
    public int tamaño() {
        return 5000;
    }

    @Override
    public String dibujar() {
        return MAPA;
    }

    @Override
    public String toString() {
        return "\nMapaG2D [Nombre: " + nombre() + " Tamaño: "+ tamaño()+"]";
    }
    
    
}
