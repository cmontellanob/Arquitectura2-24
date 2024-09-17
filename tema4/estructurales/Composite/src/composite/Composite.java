/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composite;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 1;
        int subop = 0;
        
        ProductoSimple ram4gb = new ProductoSimple("Memoria RAM 4GB", 750, "KingStone");
        ProductoSimple ram8gb = new ProductoSimple("Memoria RAM 8GB", 1000, "KingStone");
        ProductoSimple estabilizador = new ProductoSimple("Estabilizador", 750, "ikawa");
        
        ProductoSimple disk500gb = new ProductoSimple("Disco Duro 500GB", 1500, "ACME");
        ProductoSimple disk1tb = new ProductoSimple("Disco Duro 1TB", 2000, "ACME");

        ProductoSimple cpuAMD = new ProductoSimple("AMD phenon", 4000, "AMD");
        ProductoSimple cpuIntel = new ProductoSimple("Intel i7", 4500, "Intel");

        ProductoSimple smallCabinete = new ProductoSimple("Gabinete Pequeño", 2000, "ExCom");
        ProductoSimple bigCabinete = new ProductoSimple("Gabinete Grande", 2200, "ExCom");

        ProductoSimple monitor20inch = new ProductoSimple("Monitor 20'", 1500, "HP");
        ProductoSimple monitor30inch = new ProductoSimple("Monitor 30'", 2000, "HP");

        ProductoSimple simpleMouse = new ProductoSimple("Raton Simple", 150, "Genius");
        ProductoSimple gammerMouse = new ProductoSimple("Raton Gammer", 750, "Alien");

//Computadora para Gammer que incluye 8gb de ram,disco de 1tb, procesador Intel i7
//gabinete grande,monitor de 30' y un mouse gammer.
        ProductoCompuesto gammerPC = new ProductoCompuesto("Gammer PC");
        gammerPC.addProducto(ram8gb);
        gammerPC.addProducto(disk1tb);
        gammerPC.addProducto(cpuIntel);
        gammerPC.addProducto(bigCabinete);
        gammerPC.addProducto(monitor30inch);
        gammerPC.addProducto(gammerMouse);

//Computadora para Casa que incluye 4gb de ram,disco de 500gb, procesador AMD Phenon
//gabinete chico,monitor de 20' y un mouse simple.
        ProductoCompuesto homePC = new ProductoCompuesto("Casa PC");
        homePC.addProducto(ram4gb);//
        homePC.addProducto(disk500gb);
        homePC.addProducto(cpuAMD);
        homePC.addProducto(smallCabinete);
        homePC.addProducto(monitor20inch);
        homePC.addProducto(simpleMouse);

//Paque compuesto de dos paquetes, El paquete Gammer PC y Home PC
        ProductoCompuesto pc2x1 = new ProductoCompuesto("Paquete PC Gammer + Casa");
        pc2x1.addProducto(gammerPC);
        pc2x1.addProducto(homePC);
        pc2x1.addProducto(estabilizador);

        while (op != 4) {
            System.out.println("----- Cotizador ------ ");
            System.out.println("1.- Productos Separados");
            System.out.println("2.- Computadoras");
            System.out.println("3.- Combos");
            System.out.println("4.- Salir");
            System.out.print("Elija una opcion");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("--Productos Separados -----");
                    System.out.println("1.-Memoria RAM 4GB Kingstom");
                    System.out.println("2.-Memoria RAM 8GB Kingstom");
                    System.out.println("3.-Estabilizador Ikawa");
                    System.out.println("4.-Disco Duro 500GB AGME");
                    System.out.println("5.-Disco Duro 1TB AGME");
                    System.out.println("6.-AMD phenon");
                    System.out.println("7.-Intel I7");
                    System.out.println("8.-Gabinete Pequeño Excom");
                    System.out.println("9.-Gabinete Grande Excom");
                    System.out.println("10.-Monitor 20' HP");
                    System.out.println("11.-Monitor 30'");
                    System.out.println("12.-Mouse Simple Genius");
                    System.out.println("13.-Mouse Gammer aliem");
                    System.out.println("Elija sub una opcion");
                    subop = sc.nextInt();
                    switch (subop){
                        case 1:
                            System.out.println("El Precio es "+ram4gb.getPrecio());
                            break;
                            case 2:
                            System.out.println("El Precio es "+ram8gb.getPrecio());
                            break;
                            case 3:
                            System.out.println("El Precio es "+estabilizador.getPrecio());
                            break;
                            case 4:
                            System.out.println("El Precio es "+disk500gb.getPrecio());
                            break;
                            case 5:
                            System.out.println("El Precio es "+disk1tb.getPrecio());
                            break;
                            case 6:
                            System.out.println("El Precio es "+cpuAMD.getPrecio());
                            break;
                             case 7:
                            System.out.println("El Precio es "+cpuIntel.getPrecio());
                            break;
                             case 8:
                            System.out.println("El Precio es "+smallCabinete.getPrecio());
                            break;
                            case 9:
                            System.out.println("El Precio es "+bigCabinete.getPrecio());
                            break;
                            case 10:
                            System.out.println("El Precio es "+monitor20inch.getPrecio());
                            break;
                            case 11:
                            System.out.println("El Precio es "+monitor30inch.getPrecio());
                            break;
                            case 12:
                            System.out.println("El Precio es "+simpleMouse.getPrecio());
                            break;
                            case 13:
                            System.out.println("El Precio es "+gammerMouse.getPrecio());
                            break; 
                    }
                case 2:
                    System.out.println("******* computadoras *****");
                    System.out.println("1. computadora home  :");
                    System.out.println("2. computadora  gamer :");
                   
                 int opciones=sc.nextInt();
                 
                 switch(opciones){
                         case 1:
                             System.out.println("el precio es :"+homePC.getPrecio() );
                         break;
                         case 2:
                             System.out.println("el precio del gamer pc es : "+ gammerPC.getPrecio());
                             break;
                        
                       
                 }

                 
                    
                    
                    break;
                case 3:
                    System.out.println("producto compuesto");
                    System.out.println("el precio es :"+pc2x1.getPrecio() );
                    
                    
                    break;
                  
            }
        }
    }

}
