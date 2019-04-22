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
public class Exercicio05 {
    public static void main(String[] args) {
        //Variaveis
        String nome, senha;
        Scanner teclado = new Scanner(System.in);
        //Entradas
        System.out.print("Informe o nome do usuario: ");
        nome = teclado.next();
        System.out.print("Informe a senha: ");
        senha = teclado.next();
        //Processamento
        if(senha.equals(nome)){
            System.out.println("A senha não pode ser igual ao nome!");
            while(senha.equals(nome)){
                System.out.print("Informe o nome do usuario: ");
                nome = teclado.next();
                System.out.print("Informe a senha: ");
                senha = teclado.next();
            }    
        }
            
    }
    
}
