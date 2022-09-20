/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronFabricaAbstracta;

/**
 *
 * @author Usuario
 */
public class PatronFabricaAbstracta {
    
    private final JuegoDinamico juego;
    private final FabricaAbstractaGraficos fabrica; //abstract factory
    
    public PatronFabricaAbstracta(){
        
        fabrica=FabricaProductora.getGraficos2DInstaciaFabrica();
        //fabrica=FabricaProductora.getGraficos3DInstaciaFabrica();
        juego=JuegoDinamico.inicioJuego(fabrica);
        juego.comenzar();
        
        
    }
    
    public static void main (String[] args){
        new PatronFabricaAbstracta();
    }
}
