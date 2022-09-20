/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;

import Metodos.Mapa;

public class G3DMapa implements Mapa
{

      private final static String MAP = "Dibujar un mapa en 3D";

      @Override
      public String dibujar()
      {
            return MAP;
      }

      @Override
      public String nombre()
      {
            return "Mapa3D";
      }

      @Override
      public int tamaño()
      {
            return 10000;
      }

      @Override
      public String toString() {
        return "\nMapaG3D [Nombre: " + nombre() + " Tamaño: "+ tamaño()+"]";
    }

}
