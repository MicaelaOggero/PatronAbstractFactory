/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;

import Metodos.Enemigo;

/**
 *
 * @author Usuario
 */
public class G2DEnemigo implements Enemigo {
    
    private final static String ENEMIGO = "Dibujar un enemigo en 2D";
    
    @Override
    public byte puntos() {
        return 10;
    }

    @Override
    public int tiempoVida() {
        return 250;
    }

    @Override
    public int energia() {
        return 2;
    }

    @Override
    public String dibujar() {
        return ENEMIGO;
    }

    @Override
    public String toString() {
        return "\nEnemigoG2D [TiempoDeVida: "+tiempoVida()+" Energía: "+energia()+" Puntos: "+puntos()+"]";
    }
    
    
    
}
