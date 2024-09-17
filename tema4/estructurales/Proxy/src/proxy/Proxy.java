/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proxy;

import java.util.Scanner;
import calculos.*;

/**
 *
 * @author Carlos
 */
public class Proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 1;
        int a;
        int b;
        ProxyMatematicas m = new ProxyMatematicas(0, 0);

        while (op != 5) {
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Ver Log");
            System.out.println("5.- Salir");
            System.out.print("Elija una opcion");
            op = sc.nextInt();
            if (op <= 3) {
                System.out.print("Introducir el valor de a");
                a = sc.nextInt();
                System.out.print("Introducir el valor de b");
                b = sc.nextInt();
                m.setA(a);
                m.setB(b);
            }
            switch (op) {
                case 1:
                    int suma = m.Sumar();
                    System.out.println("la suma es " + suma);
                    break;
                case 2:
                    int resta = m.Restar();
                    System.out.println("la resta es " + resta);
                    break;
                case 3:
                    int multiplicacion = m.Multiplicar();
                    System.out.println("la mutiplicacion es " + multiplicacion);
                    break;
                case 4:
                    m.ImprimirLog();
                    break;

            }
        }
    }

}
