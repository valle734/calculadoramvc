/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author jimmy
 */
import Vista.VistaCalculadora;
import Modelo.ModeloCalculadora;

public class ControladorCalculadora {
    private ModeloCalculadora model;
    private VistaCalculadora view;

    public ControladorCalculadora(ModeloCalculadora model, VistaCalculadora view) {
        this.model = model;
        this.view = view;
    }

    public void realizarOperacion() {
        double num1 = view.getNum1();
        double num2 = view.getNum2();
        String operacion = view.getOperacion();

        switch (operacion) {
            case "+":
                model.sumar(num1, num2);
                break;
            case "-":
                model.restar(num1, num2);
                break;
            case "*":
                model.multiplicar(num1, num2);
                break;
            case "/":
                model.dividir(num1, num2);
                break;
            default:
                System.out.println("Operación inválida");
                return;
        }

        view.mostrarResultado(model.getResultado());
    }
}

