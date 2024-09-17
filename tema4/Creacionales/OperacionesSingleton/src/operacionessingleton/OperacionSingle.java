/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionessingleton;

import java.util.Set;

/**
 *
 * @author DELL
 */
public class OperacionSingle {
    private static OperacionSingle instancia;
    int a;
    int b;
    
    public static OperacionSingle getInstancia(int a, int b) {
        if (instancia==null)    {
            instancia=new OperacionSingle(a,b);
        }else
        {
            instancia.setA(a);
            instancia.setB(b);
        }
        return instancia;
    }

    private OperacionSingle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public int sumar(){
        return this.a + this.b;
    }
    public int restar(){
        return this.a - this.b;
    }
    public int multiplicar(){
        return this.a * this.b;
    }
    public int dividir(){
        return this.a / this.b;
    }
            
}
