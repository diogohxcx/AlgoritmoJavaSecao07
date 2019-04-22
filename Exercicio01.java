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
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        //Variaveis
        int num, maior = 0;
        Scanner teclado = new Scanner(System.in);
        //Entradas
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        //Processamento
        while(num != 0){
            if(num > maior){
                maior = num;    
            }
            System.out.print("Digite um número: ");
                 num = teclado.nextInt();
        }
        System.out.printf("O maior número digitado foi %d:\n", maior);
        teclado.close();
    }
    
}
