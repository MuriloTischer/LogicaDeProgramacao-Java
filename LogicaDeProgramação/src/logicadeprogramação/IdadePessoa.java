/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicadeprogramação;

import java.util.Scanner;

public class IdadePessoa {
    /*    EXERCICIO:
    Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
    meses e dias e escreva a idade dessa pessoa expressa apenas em dias. 
    Considerar ano com 365 dias e mês com 30 dias.*/

    public static void main(String[] args) {
         int ano, dias, meses;
        System.out.println("Informe o ano atual");
        int anoAtual = new Scanner(System.in).nextInt();
        
        System.out.println("Informe seu ano de nascimento");
        int anoNascimento = new Scanner(System.in).nextInt();
        
       
        ano = anoAtual - anoNascimento;
        dias = ano * 365;
        meses = dias / 30;
        
        System.out.println("Você está vivo por " +ano+ " anos");
        System.out.println("Com total de " +meses+ "meses");
        System.out.println("Aproximadamente " +dias+ " dias");
        
       
        
    }
}
