package PatronFabricaAbstracta;

import Fabricas.*;
import Metodos.*;
import java.util.Objects;
import PatronFabricaAbstracta.FabricaAbstractaGraficos;

public final class FabricaGraficos3D implements FabricaAbstractaGraficos
{

      private static FabricaAbstractaGraficos instancia;

      private FabricaGraficos3D()
      {}

      protected static FabricaAbstractaGraficos getInstance()
      {
            instancia = Objects.isNull(instancia) ? new FabricaGraficos3D() : instancia;
            return instancia;
      }

      @Override
      public Personaje crearPersonaje()
      {
            return new G3DPersonaje();
      }

      @Override
      public Arma crearArma()
      {
            return new G3DArma();
      }

      @Override
      public Mapa crearMapa()
      {
            return new G3DMapa();
      }

      @Override
      public Enemigo crearEnemigo()
      {
            return new G3DEnemigo();
      }
}
