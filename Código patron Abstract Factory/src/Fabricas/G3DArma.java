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
public class G3DArma implements Arma 
{

      private final static String WEAPON = "Dibujar un arma en 3D";

      @Override
      public String dibujar()
      {
            return WEAPON;
      }

      @Override
      public int duracion()
      {
            return 10;
      }

      @Override
      public int energia()
      {
            return 1;
      }

      @Override
      public String toString() {
        return "\nArmaG3D [Duración: "+duracion()+" Energía: "+energia()+"]";
    }

}