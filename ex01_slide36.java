/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho2bim;

import java.util.Scanner;

/**
 *
 * @author maico
 */
public class ex01_slide36 {

    public static void main(String[] args) {

        int[] vetor = {3, 6, 7, 1, 19, 16, 5, 19, 12, 11};

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um valor entre 0 e 20 para buscar no vetor: ");
        int valor_informado = s.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor_informado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O valor " + valor_informado + " está presente.");
        } else {
            System.out.println("O valor " + valor_informado + " não está presente.");
        }

        s.close();
    }

}
