/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculos;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ProxyMatematicas implements IMatematicas {
    private ArrayList<String>  logs;
    Matematicas matematicas;

    public ProxyMatematicas(int a, int b) {
        this.matematicas = new Matematicas(a, b);
        logs =new ArrayList<String>();
        
    }
     public void setA(int a) {
        this.matematicas.setA(a);
    }

      public void setB(int b) {
       this.matematicas.setB(b);
    }

    @Override
    public int Sumar() {
        this.logs.add("Eligio Sumar");
        return this.matematicas.Sumar();
    }

    @Override
    public int Restar() {
        this.logs.add("Eligio Restar");
        return this.matematicas.Restar();
    }

    @Override
    public int Multiplicar() {
        this.logs.add("Eligio Multiplicar");
        return this.matematicas.Multiplicar();
    }
    
    public void ImprimirLog()
    {
        for(String l:logs)
        {
            System.out.println(l);
        }
    }

}
