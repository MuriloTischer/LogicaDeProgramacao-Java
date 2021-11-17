/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicadeprogramacao;

import java.util.Scanner;

public class SalarioComReajuste {

    /*Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário.*/
    public static void main(String[] args) {
        double salarioAtual;
        double novoSalario;
        double reajuste;
        double porcentualReajuste;

        System.out.println("Informe o seu salario atual...");
        salarioAtual = new Scanner(System.in).nextDouble();

        System.out.println("Informe o valor(%) do reajuste obtido...");
        reajuste = new Scanner(System.in).nextDouble();

        porcentualReajuste = salarioAtual * (reajuste / 100);

        novoSalario = salarioAtual + porcentualReajuste;

        System.out.println("A partir de hoje você recebera. " + novoSalario);
        System.out.println("Você esta recebendo " + porcentualReajuste
                + " de reajuste salarial. Parabéns.");

    }
}
