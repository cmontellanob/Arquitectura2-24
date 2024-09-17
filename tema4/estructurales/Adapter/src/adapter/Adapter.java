/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapter;

import java.util.Scanner;


/**
 *
 * @author Carlos
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         
        int op=1;
        int a ;
        int b ;
        IMatematicas m=new AdaptadorMatematicas();
       
        while (op != 2) {
            System.out.println("1.- Sumar");
            System.out.println("2.- Salir");
            System.out.print("Elija una opcion");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Introducir el valor de a");
                    a = sc.nextInt();
                    System.out.print("Introducir el valor de b");
                    b = sc.nextInt();
                    int suma=m.Sumar(a,b);
                    System.out.println("la suma es "+suma);
                    break;
            }
        }
    }

}
