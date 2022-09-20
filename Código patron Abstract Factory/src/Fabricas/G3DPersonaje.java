/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;

import Metodos.Personaje;

public class G3DPersonaje implements Personaje
{

      private final static String CHARACTER = "Dibujar un personaje en 3D";

      @Override
      public String dibujar()
      {
            return CHARACTER;
      }

      @Override
      public int tiempoVida()
      {
            return 50;
      }

      @Override
      public int energia()
      {
            return 1;
      }

      @Override
      public int puntosTotales()
      {
            return 0;
      }

      @Override
      public String toString(){
        return "\nPersonajeG3D [TiempoDeVida: "+tiempoVida()+" Energía: " + energia()+ " Puntos iniciales: "+puntosTotales()+"]";
      }

}
