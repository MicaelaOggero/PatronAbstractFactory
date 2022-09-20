package Fabricas;

import Metodos.Enemigo;

public class G3DEnemigo implements Enemigo
{

      private final static String ENEMY = "Dibujar un enemigo en 3D";

      @Override
      public String dibujar()
      {
            return ENEMY;
      }

      @Override
      public int tiempoVida()
      {
            return 150;
      }

      @Override
      public int energia()
      {
            return 5;
      }

      @Override
      public byte puntos()
      {
            return 15;
      }

      @Override
      public String toString() {
        return "\nEnemigoG3D [TiempoDeVida: "+tiempoVida()+" Energía: "+energia()+" Puntos: "+puntos()+"]";
     }

}
