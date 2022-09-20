/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronFabricaAbstracta;

import Metodos.Item;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.WindowConstants;

/**
 *
 * @author Usuario
 */
public final class JuegoDinamico {
    
    private DinamicFrame frame;
    private final JArea textArea;
    private final List<Item> listaItem=new ArrayList<>();
    
    private JuegoDinamico(FabricaAbstractaGraficos fabrica){
        
        setFrame();
        cargarLista(fabrica);
        textArea =frame.getTextArea(listaItem);
        
    }
    
    private void cargarLista(FabricaAbstractaGraficos fabrica){
        
        listaItem.add(fabrica.crearPersonaje());
        listaItem.add(fabrica.crearEnemigo());
        listaItem.add(fabrica.crearMapa());
        listaItem.add(fabrica.crearArma());
    
    }
    
    private void setFrame(){
        
        frame=new DinamicFrame();
        
        var dimension =Toolkit.getDefaultToolkit().getScreenSize();
        
        var width=(int)dimension.getWidth()-200;
        var height =(int) dimension.getHeight()-200;
        
        frame.setSize(width, height);
        frame.initComponents();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    public static JuegoDinamico inicioJuego(FabricaAbstractaGraficos fabrica){
        
        return new JuegoDinamico(fabrica);
        
    }
    
    public void comenzar(){
        frame.setVisible(true);
        textArea.startTimer();
    }
}
