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
public class Exercicio04 {
    public static void main(String[] args) {
        //Variaveis
        int num, maior = 0, menor = 9999, soma = 0;
        float media ;
        Scanner teclado = new Scanner(System.in);
        //Entrada e Processamento
        for(int i = 0; i < 10; i++){
            System.out.printf("Informe o número para pocisão %d: ", i);
            num = teclado.nextInt();
            if(num > maior){
                maior = num;   
            }
            if(num < menor){
                menor = num;
            }
            soma = soma + num;
        }
    media = soma / 10;
    System.out.println("O maior valor foi: " + maior);
    System.out.println("O menor valor foi: " + menor);
    System.out.println("A media foi de: " + media);
    System.out.println("A soma de todos os valores foi: "+ soma);
    teclado.close();     
    
  }  
}
