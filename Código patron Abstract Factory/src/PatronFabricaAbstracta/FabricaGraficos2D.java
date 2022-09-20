package PatronFabricaAbstracta;

import Fabricas.*;
import Metodos.Arma;
import Metodos.Enemigo;
import Metodos.Mapa;
import Metodos.Personaje;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class FabricaGraficos2D implements FabricaAbstractaGraficos {
    
    private static FabricaAbstractaGraficos instancia;
    
    private FabricaGraficos2D(){}

    
    
    //singleton 
    protected static FabricaAbstractaGraficos getInstance(){
        instancia=Objects.isNull(instancia)? new FabricaGraficos2D():instancia;
        return instancia;
    }
    
    @Override
    public Personaje crearPersonaje() {
        return new G2DPersonaje();
    }

    @Override
    public Arma crearArma() {
        return new G2DArma();
    }

    @Override
    public Mapa crearMapa() {
        return new G2DMapa();
    }

    @Override
    public Enemigo crearEnemigo() {
        return new G2DEnemigo();
    }
    
}
