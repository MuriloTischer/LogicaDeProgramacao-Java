/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicadeprogramacao;

import java.util.Scanner;

/**
 *
 * @author muuti
 */
public class CalculandoTemperatura {
    /*Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
correspondente em graus Celsius (baseado na fórmula abaixo):
   C           F - 32
---------- = -----------
   5             9

*/
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        
        System.out.println("Informe a temperatura em graus Fahrenheit");
        fahrenheit = new Scanner(System.in).nextDouble();
        
        celsius = ((fahrenheit * 0.55) -17);
        
        System.out.println("A temperatura convertida em graus celsius é: " +celsius+ "º");
                
    }
}
