/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex12 {

    public static void main(String[] args) {
        int[] vetor = {1, 22, 333, 4444, 55555};

        imprimir_vetor(vetor);
    }

    public static void imprimir_vetor(int[] vetor) {
        System.out.print("Vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);

            if (i < vetor.length - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();
    }
}
