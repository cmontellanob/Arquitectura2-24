/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

import calculos.Matematicas;

/**
 *
 * @author Carlos
 */

public class AdaptadorMatematicas implements IMatematicas{
    private Matematicas matematicas;

    public AdaptadorMatematicas(){
        this.matematicas=new Matematicas();
    }
    @Override
    public int Sumar(int a, int b) {
        int [] elementos=new int[2];
        elementos[0]=a;
        elementos[1]=b;
        return this.matematicas.sumar(elementos);
    }
    
    
}
