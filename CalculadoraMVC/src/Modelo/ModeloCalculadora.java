/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jimmy
 */
public class ModeloCalculadora {
    private double resultado;

    public void sumar(double num1, double num2) {
        resultado = num1 + num2;
    }

    public void restar(double num1, double num2) {
        resultado = num1 - num2;
    }

    public void multiplicar(double num1, double num2) {
        resultado = num1 * num2;
    }

    public void dividir(double num1, double num2) {
        resultado = num1 / num2;
    }

    public double getResultado() {
        return resultado;
    }
}

