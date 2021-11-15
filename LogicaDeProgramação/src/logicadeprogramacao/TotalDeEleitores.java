/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicadeprogramacao;

import java.util.Scanner;


public class TotalDeEleitores {

    /*Exercicio: 
    Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
    brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
    de eleitores. */

    public static void main(String[] args) {
        int eleitor, votoNulo, votoBranco, votos;
        System.out.println("Informe a quantidade de eleitores do Municipio");
        eleitor = new Scanner(System.in).nextInt();

        System.out.println("Informe a quantidade de votos nulos obtidos");
        votoNulo = new Scanner(System.in).nextInt();

        System.out.println("Informe a quantidade de votos em branco obtido");
        votoBranco = new Scanner(System.in).nextInt();

        votos = votoNulo + votoBranco;
        System.out.println("A quantidade de votos brancos e nulos foram de: " + votos);

        // indicando o porcentual dos votos
        double porcentualNulo;
        double porcentualBranco;
        double porcentualVotos;

        porcentualNulo = (votoNulo * 100) / eleitor;
        porcentualBranco = (votoBranco * 100) / eleitor;
        porcentualVotos = (votos * 100) / eleitor;

        System.out.println("Os votos nulos equivalem a uma quantidade de " + porcentualNulo + "%");
        System.out.println("Os votos brancos equivalem a uma quantidade de " + porcentualBranco + "%");
        System.out.println("O percentual de eleitores que votaram equivalem a uma quantidade de " + porcentualVotos + "%");

    }
}
