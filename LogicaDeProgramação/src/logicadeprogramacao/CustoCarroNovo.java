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
public class CustoCarroNovo {
    /*O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor.
*/
    public static void main(String[] args) {
        
        double porcentualDistribuidor = 0.28;
        double porcentualImpostos = 0.45;
        double valorCarroFabrica;
        double valorFinalCarro;
        
        System.out.println("Informe o valor do carro");
        valorCarroFabrica = new Scanner(System.in).nextDouble();
        
        valorFinalCarro = valorCarroFabrica;
        valorFinalCarro = valorFinalCarro + valorCarroFabrica * porcentualDistribuidor;             
        valorFinalCarro = valorFinalCarro + valorCarroFabrica * porcentualImpostos;
        
        System.out.println("Valor com impostos " +valorFinalCarro);
    }
    
}
