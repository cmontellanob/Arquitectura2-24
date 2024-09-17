package calculos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carlos
 */
public class Matematicas implements IMatematicas {
    int a,b;

    public Matematicas(int a, int b) {
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
    
    public int Sumar()
    {
        return this.a+this.b;
        
    }
    public int Restar()
    {
        return this.a-this.b;
        
    }
    public int Multiplicar()
    {
        return this.a*this.b;
        
    }
    
    
}
