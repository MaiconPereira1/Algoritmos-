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
public class ex05_slide37 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] vetor = new int[10];
           for (int i = 0; i < vetor.length; i++){
               vetor[i] = (int) (Math.random()* 21);
           }
        System.out.println();
        
        System.out.print("Digite um valor entre 0 e 20 para buscar no vetor: ");
        int num_busca = s.nextInt();
        
        boolean valor_encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num_busca) {
                valor_encontrado = true;
                break;
           }
         }
        if (valor_encontrado) {
            System.out.println("O valor " + num_busca + " está no vetor.");
        } else {
            System.out.println("O valor " + num_busca + " não está no vetor.");
        }
        
        
        s.close();
    }
    
}
