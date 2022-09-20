/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Metodos;

/**
 *
 * @author Usuario
 */
public interface Enemigo extends Personaje {
    
    byte puntos();
    
    @Override
    default int puntosTotales(){
        return 0;
    }
    
}
