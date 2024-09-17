/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int op = 1;
      
        ICuentaBancaria cuenta = null;

        while (op != 2) {
            System.out.println("----- Cuenta ------ ");
            System.out.println("1.- Abrir Cuenta");
            System.out.println("2.- Salir");

            System.out.print("Elija una opcion");
            op = sc.nextInt();
            if (op == 1) {

                System.out.print("Introduzca Id");
                int id = sc.nextInt();
                System.out.print("Introduzca Cliente");
                String cliente = sc.next();
                sc.nextLine();
                Cuenta c = new Cuenta(id, cliente);
                System.out.println("----- Tipo de Cuenta a abrir ------ ");
                System.out.println("1.- Cuenta de Ahorro");
                System.out.println("2.- Cuenta de Corriente");
       

                System.out.print("Elija tipo de cuenta");

                int subop = sc.nextInt();
                switch (subop) {
                    case 1:
                        cuenta = new CuentaAhorro();
                        break;
                    case 2:
                        cuenta = new CuentaCorriente();
                        break;

                }
                cuenta.abrirCuenta(c);
                System.out.print("Desea blindar la cuenta s/n");
                String blindaje = sc.next();

                if (blindaje.equals('s')) {
                    ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
                    cuentaBlindada.abrirCuenta(c);
                }
                

            }
        }
    }

}
