/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho2bim;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maicon
 */
public class ex07_slide37 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] vetor = new int[50];
        
        Random ram = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ram.nextInt(10) + 1;
        }
        
        System.out.print("Digite um número de 1 a 10: ");
        int num_usuario = s.nextInt();
        
        int cont = 0;
        for (int valor : vetor) {
            if (valor == num_usuario) {
                cont++;
            }
        }
        System.out.println("O número " + num_usuario + " aparece " + cont + " vezes no vetor.");
        
        s.close();
    }
    
}
