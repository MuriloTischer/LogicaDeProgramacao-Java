/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicadeprogramação;

import java.util.Scanner;

public class NumeroAntecessor {
      //  EXERCICIO: 
     //  Escreva um algoritmo para ler um valor (do teclado) 
    //   e escrever (na tela) o seu antecessor.

    public static void main(String[] args) {
       int valor, antecessor; 
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor");
        valor = scanner.nextInt();

        System.out.println("O valor informado foi o numero" + valor);

        antecessor = valor - 1;
        System.out.println("O antecessor do valor informado é " + antecessor);

    }

}
