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
public class Exercicio07 {
    public static void main(String[] args) {
        //Variveis
        int codigo, defeito, quantidade=0, falha1=0, falha2=0, falha3=0, falha4=0;
        float perc1,perc2,perc3,perc4;
       
        Scanner teclado = new Scanner(System.in);
        //Entradas e Processamento
        System.out.print("Digite o código: ");
        codigo = teclado.nextInt();
        while(codigo != 0){
            System.out.println("***Informe o tipo do problema***");
            System.out.println("1 - Necessita de esfera. ");
            System.out.println("2 - Necessita de limpeza. ");
            System.out.println("3 - Necessita troca do cabo. ");
            System.out.println("4 - Quebrado.");
            System.out.print("Digite: ");
            defeito = teclado.nextInt();
            System.out.print("Digite o código: ");
            codigo = teclado.nextInt();
            quantidade = quantidade + 1;
            if(defeito == 1){
                falha1 = falha1 + 1;
            }
            if(defeito == 2){
                falha2 = falha2 + 1;
            }
            if(defeito == 3){
                falha3 = falha3 + 1;
            }
            if(defeito == 4){
                falha4 = falha4 +1;
            }
        }
        perc1 = (falha1 * 100)/quantidade;
        perc2 = (falha2 * 100)/quantidade;
        perc3 = (falha3 * 100)/quantidade;
        perc4 = (falha4 * 100)/quantidade;
        System.out.println("Situação\t\t\tQuantidade\t\tPercentual");
        System.out.printf("1 - Necessita de esfera:\t\t%d\t\t%.2f%%\n",falha1, perc1);
        System.out.printf("2 - Necessita de limpeza:\t\t%d\t\t%.2f%%\n",falha2, perc2);
        System.out.printf("3 - Necessita troca do cabo:\t\t%d\t\t%.2f%%\n",falha3, perc3);
        System.out.printf("4 - Quebrado:\t\t\t\t%d\t\t%.2f%%\n",falha4, perc4);
    }
    
}
