/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ardili.secao07;

import java.util.Scanner;

/**
 *
 * @author diogo
 */
public class Exercicio06 {
    public static void main(String[] args) {
        //Variveis
        int num;
        Scanner teclado = new Scanner(System.in);
        //Entrada
        System.out.print("Informe um número entre 1 e 10 para ver sua tabuada: ");
        num = teclado.nextInt();
        //Processamento
        for(int i = 1; i < 11; i ++){
            System.out.printf("%d X %d = %d\n", i, num, i * num);
        }
    }    
}
