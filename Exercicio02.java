/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ardili.secao07;

/**
 *
 * @author diogo
 */
public class Exercicio02 {
    public static void main(String[]args){
        for(int i = 0; i < 100; i ++ ){
            System.out.printf("%d\n", i);
            if(i % 10 == 0 && i > 0){
                System.out.println("Multiplo de 10!");
            }
        }
    }
    
}
