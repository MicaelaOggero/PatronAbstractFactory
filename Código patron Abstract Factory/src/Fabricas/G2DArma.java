/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;

import Metodos.Arma;

/**
 *
 * @author Usuario
 */
public class G2DArma implements Arma {
   
    private final static String ARMA = "Dibujar un arma en 2D";

    @Override
    public int duracion() {
        return 10;
    }

    @Override
    public int energia() {
        return 100;
    }

    @Override
    public String dibujar() {
    return ARMA;
    }

    @Override
    public String toString() {
        return "\nArmaG2D [Duración: "+duracion()+" Energía: "+energia()+"]";
    }
    
}
