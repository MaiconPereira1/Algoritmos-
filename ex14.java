
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maico
 */
public class ex14 {

    public static void main(String[] args) {
        int[] vetor = new int[20];
        preencher_aleatorio(vetor);
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": Número " + vetor[i] + " - " + par_impar(vetor[i]));
        }
    }

    public static String par_impar(int num) {
        return (num % 2 == 0) ? "Par" : "Ímpar";
    }

    public static void preencher_aleatorio(int[] vetor) {
        Random random = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }
    }
}

