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
public class Teste {

    Produto produtos[] = new Produto[10];
  
    public static void main(String[] args) {
        
        System.out.println("teste");
        Teste t = new Teste();
        t.produtos[0] = new Produto();
        
        t.produtos[0] = null;
        
        System.gc();
        
        
    }
    
    
    
    
}
