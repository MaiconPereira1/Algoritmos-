/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho2bim;

import java.util.Random;

/**
 *
 * @author maicon
 */
public class ex06_slide37 {

    public static void main(String[] args) {
        int[] vetor = new int[30];
        
        Random ram = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ram.nextInt(100);
        }
        int somar = 0;
        for (int valor : vetor) {
            somar += valor;
        }
        int menor = vetor[0];
        int maior = vetor[0];
        for (int valor : vetor) {
            if (valor < menor) {
                menor = valor;
            }
            if (valor > maior) {
                maior = valor;
            }
        }
        System.out.println(">RESULTADO:");
        System.out.println("Soma: " + somar);
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
        System.out.print("Vetor[0]:" + vetor[0]);
        System.out.print(" |Vetor[9]:" + vetor[9]);
        System.out.print(" |Vetor[19]:" + vetor[19]);
        System.out.print(" |Vetor[29]:" + vetor[29]);
    }
    
}
