/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facade;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         
        int op=1;
        String fechaInicial;
        String fechaFinal;
        String origen;
        String destino;
        FachadaPaquetes fachada=new FachadaPaquetes();
        
        while (op != 2) {
            System.out.println("1.- Buscar Paquetes");
            System.out.println("2.- Salir");
            System.out.print("Elija una opcion");
            op = sc.nextInt();
            switch (op) {
                case 1:
                   
                    System.out.println("Introducir fecha inicial");
                    fechaInicial = sc.next();
                    
                    System.out.println("Introducir fecha Final");
                    fechaFinal = sc.next();
                    System.out.println("Origen");
                    origen = sc.next();
                    System.out.println("Destino");
                    destino = sc.next();
                    fachada.buscar(fechaInicial, fechaFinal, origen, destino);
                    
                   // System.out.println("la suma es "+suma);
                    break;
            }
        }
    }
    
}
