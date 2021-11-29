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
public class IntervalosNumericos {

    /*
  Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles
estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve
terminar quando for lido um número negativo.

     */
    public static void main(String[] args) {
        int primeiroIntervalo = 0;
        int segundoIntervalo = 0;
        int terceiroIntervalo = 0;
        int quartoIntervalo = 0;
        int foraDoIntervalo = 0;
        int numero;

        do {
            System.out.println("Informe um valor...");
            numero = new Scanner(System.in).nextInt();

            if (numero >= 0) {

                if (numero < 0 || numero > 100) {
                    foraDoIntervalo++;

                } else {
                    if ((numero >= 0) && (numero <= 25)) {
                        primeiroIntervalo++;
                    }
                    if ((numero >= 26) && (numero <= 50)) {
                        segundoIntervalo++;
                    }
                    if ((numero >= 51) &&(numero <= 75)) {
                        terceiroIntervalo++;
                    }
                    if ((numero >= 76) && (numero <= 100)) {
                        quartoIntervalo++;
                    }
                }
            }
        } while (numero >= 0 );

        System.out.println(primeiroIntervalo + " numero(s) informado(s) dentro do intervalo de [0-25] ");
        System.out.println(segundoIntervalo + " numero(s) informado(s)  dentro do intervalo de [26-50] ");
        System.out.println(terceiroIntervalo + " numero(s) informado(s) dentro do intervalo de [51-75] ");
        System.out.println(quartoIntervalo + " numero(s) informado(s) dentro do intervalo de [76-100] ");
        System.out.println(foraDoIntervalo + " numero(s) informado(s) fora do intervalo de [0 - 100] ");

    }
}
