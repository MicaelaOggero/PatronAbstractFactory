/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronFabricaAbstracta;

/**
 *
 * @author Usuario
 */
public final class FabricaProductora {

    private FabricaProductora() {}

    public static FabricaAbstractaGraficos getGraficos2DInstaciaFabrica() {
        return FabricaGraficos2D.getInstance();
    }
    
    public static FabricaAbstractaGraficos getGraficos3DInstaciaFabrica() {
        return FabricaGraficos3D.getInstance();
    }
    
}
