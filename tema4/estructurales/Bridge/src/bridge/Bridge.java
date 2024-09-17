/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridge;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 1;
        ElaborarAlimento lasagna = new ElaborarLasagna();
        while (op != 5) {
            System.out.println("----- Preparacion de Lasaña ------ ");
            System.out.println("1.- Lasaña de Carne");
            System.out.println("2.- Lasaña Picante");
            System.out.println("3.- Lasaña de Verduras");
            System.out.println("4.- Lasaña de Pollo");
            System.out.println("5.- Salir");
            System.out.print("Elija una opcion");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    lasagna.setImplementador(new Carne());
                    break;
                case 2:
                    lasagna.setImplementador(new Picante());
                    break;
                case 3:
                    lasagna.setImplementador(new Verduras());
                    break;
                case 4:
                    lasagna.setImplementador(new Pollo());
                    break;

            }
            lasagna.obtener();

        }
    }
}
