/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author jimmy
 */
import java.util.Scanner;

public class VistaCalculadora {
    private double num1, num2;
    private String operacion;

    public void obtenerEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();
        System.out.print("Ingrese la operación (+, -, *, /): ");
        operacion = scanner.next();
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void mostrarResultado(double resultado) {
        System.out.println("El resultado es: " + resultado);
    }
}

