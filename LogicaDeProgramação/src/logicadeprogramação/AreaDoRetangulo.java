/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicadeprogramação;

import java.util.Scanner;

/**
 *
 * @author muuti
 */
public class AreaDoRetangulo {
/* EXERCICIO.
 Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), 
 calcular e escrever aárea do retângulo.*/
    public static void main(String[] args) {
        int area;
        int base, altura;
        
        System.out.println("Digite o tamanho da base do retangulo");
        base = new Scanner(System.in).nextInt();
        
        System.out.println("Digite a altura do retangulo");
        altura = new Scanner(System.in).nextInt();
        
        area = base * altura;
        System.out.println("A area do retangulo é de " +area);
    }
    
}
