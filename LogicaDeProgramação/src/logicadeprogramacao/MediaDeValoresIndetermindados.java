/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicadeprogramacao;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author muuti
 */
public class MediaDeValoresIndetermindados {

    /*
    Desenvolver um algoritmo que leia um número não determinado de valores e calcule e escreva a
média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade de valores
negativos e o percentual de valores negativos e positivos.

     */
    public static void main(String[] args) {
        double mediaAritimetica = 0;
        double qtdeValorPositivo = 0;
        double qtdeValorNegativo = 0;
        double qtdeValoresDigitados = 0;

        int valorPositivo = 0;
        int valorNegativo = 0;
        int valorDigitado = 0;

        do {
            System.out.println("Informe um valor. ");
            valorDigitado = new Scanner(System.in).nextInt();
            if (valorDigitado != 0) {
                
                if (valorDigitado > 0) {
                    qtdeValorPositivo++;
                    valorPositivo += valorDigitado;
                    System.out.println("Valor positivo: " + qtdeValorPositivo);
                } else {
                    qtdeValorNegativo++;
                    valorNegativo += valorDigitado;
                    System.out.println("Valor negativo: " + qtdeValorNegativo);
                }
                qtdeValoresDigitados++;
            }

        } while (valorDigitado != 0);

        mediaAritimetica = (valorPositivo + valorNegativo) / qtdeValoresDigitados;

        double percentualPositivo = (qtdeValorPositivo / qtdeValoresDigitados) * 100;
        double percentualNegativo = (qtdeValorNegativo / qtdeValoresDigitados) * 100;

        System.out.println("Foi informado o total de " + qtdeValoresDigitados + " valor(es)");

        System.out.println(+qtdeValorPositivo + " valor(es) positivo(s) ");
        System.out.println(+qtdeValorNegativo + " valor(es) negativo(s) ");
        System.out.println();

        System.out.println("A media aritimética obtida foi " + new DecimalFormat("0.00").format(mediaAritimetica));
        System.out.println("Soma dos valores positivos: " + valorPositivo);
        System.out.println("Soma dos valores negativos: " + valorNegativo);
        System.out.println();

        System.out.println("Porcentagem de valores positivos é de " + new DecimalFormat("0.00").format(percentualPositivo) + "%");
        System.out.println("Porcentagem de valores negativos é de " + new DecimalFormat("0.00").format(percentualNegativo) + "%");

    }

}
