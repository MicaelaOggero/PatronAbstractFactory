/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;

import Metodos.Personaje;

/**
 *
 * @author Usuario
 */
public class G2DPersonaje implements Personaje {

    private final static String PERSONAJE="Dibujar un personaje en 2D";
    
    @Override
    public int tiempoVida() {
        return 100;
    }

    @Override
    public int energia() {
        return 5;
    }

    @Override
    public int puntosTotales() {
        return 0;
    }

    @Override
    public String dibujar() {
        return PERSONAJE;
    }
    
    public String toString(){
        return "\nPersonajeG2D [TiempoDeVida: "+tiempoVida()+" Energía: " + energia()+ " Puntos iniciales: "+puntosTotales()+"]";
    }
    
}
