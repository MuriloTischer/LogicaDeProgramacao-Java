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
public class CalcularTabuada {
/* 
    Desenvolva um algoritimo para calcular a tabuada
*/
    
    public static void main(String[] args) {
        int contador = 0,
                limite = 10,
                resultado,
                tabuada;

        System.out.println("Qual tabuada você quer resolver?");
        tabuada = new Scanner(System.in).nextInt();

        do {
            resultado = tabuada * contador;
            System.out.println(tabuada + " x " + contador + " = " + resultado);
            contador++;
            
        } while (contador <= limite);
    }

}
