/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemas.exercicio2;

/**
 *
 * @author jonas
 */
public class Produto {

    {

        System.out.println("Inicio");

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("fim");
    }

    private int Valor;

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }
    
    
    
}
