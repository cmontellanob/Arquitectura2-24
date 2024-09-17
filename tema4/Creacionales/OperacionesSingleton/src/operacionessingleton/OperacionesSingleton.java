/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionessingleton;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class OperacionesSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        int a = 0;
        int b = 0;
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println("Elija una opcion");
            System.out.println("1 Introducir datos");
            System.out.println("2 sumar");
            System.out.println("3 restar");
            System.out.println("4 multiplicar");
            System.out.println("5 dividir");
            System.out.println("6 salir");
            
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Introduzca A");
                    a = sc.nextInt();
                    System.out.println("Introduzca B");
                    b = sc.nextInt();
                    break;
                case 2:
                    System.out.println("suma"+OperacionSingle.getInstancia(a, b).sumar());
                    break;
                case 3:
                    System.out.println("resta"+OperacionSingle.getInstancia(a, b).restar());
                    break;
                case 4:
                    System.out.println("multiplicacion"+OperacionSingle.getInstancia(a, b).multiplicar());
                    break;
                case 5:
                    System.out.println("division"+OperacionSingle.getInstancia(a, b).dividir());
                    break;
            }
        }while(opcion!=6);
    }
    
}
