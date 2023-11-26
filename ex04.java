/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho2bim;

import java.util.Scanner;

/**
 *
 * @author maicon
 */
public class ex04 {
    
    public static void main(String[] args) {
        
        int[] vetor_1 = new int[8];
        int[] vetor_2 = new int[8];
        int[] vetor_multiplicacao = new int[8];

        Scanner s = new Scanner(System.in);

        System.out.println("Digite os valores para o primeiro vetor:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor_1[i] = s.nextInt();
        }

        System.out.println("Digite os valores para o segundo vetor:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor_2[i] = s.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            vetor_multiplicacao[i] = vetor_1[i] * vetor_2[i];
        }
        System.out.println("Resultado da multiplicação:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Resultado " + (i + 1) + "°: " + vetor_multiplicacao[i]);
        }

        s.close();
    }
    
}
