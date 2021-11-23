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
public class CalculoDaMedia {
    public static void main(String[] args) {
        double primeiraNota, segundaNota,terceiraNota,quartaNota,mediaFinal;
        String aluno;
        
        System.out.println("Informe o nome do aluno. ");
        aluno = new Scanner(System.in).next();
        
        
            System.out.println("Informe a primeira nota: " );
            primeiraNota = new Scanner(System.in).nextDouble();
            
            System.out.println("Informe a segunda nota: " );
            segundaNota = new Scanner(System.in).nextDouble();
            
            System.out.println("Informe a terceira nota: " );
            terceiraNota = new Scanner(System.in).nextDouble();
            
            System.out.println("Informe a quarta nota: " );
            quartaNota = new Scanner(System.in).nextDouble();
            
        mediaFinal = (primeiraNota + segundaNota + terceiraNota + quartaNota) /4;
        
        System.out.println("O aluno: " + aluno + " obteve a média: " + mediaFinal);
        
        if (mediaFinal >= 7){
            System.out.println("Parabéns, "  + aluno + "!! Você foi APROVADO!");
            
            
        }else{
            System.out.println("Infelizmente sua meta não foi alcançada, " +
                    "estude mais e tente novamente.");
        }
    }
    
}
