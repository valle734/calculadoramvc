/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoramvc;


/**
 *
 * @author jimmy
 */
import Vista.VistaCalculadora;
import Modelo.ModeloCalculadora;
import Controlador.ControladorCalculadora;
public class CalculadoraMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModeloCalculadora model = new ModeloCalculadora();
        VistaCalculadora view = new VistaCalculadora();
        ControladorCalculadora controller = new ControladorCalculadora(model, view);

        view.obtenerEntrada();
        controller.realizarOperacion();
        
    }
    
}
