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
public class ex02_slide36 {

    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 23, 34, 45, 56, 67, 78, 89, 98, 1000000000};

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero_informado = s.nextInt();

            boolean valor_encontrado = false;
            for (int o = 0; o < vetor.length; o++) {
                if (vetor[o] == numero_informado) {
                    valor_encontrado = true;
                    break;
                }
            }
            if (valor_encontrado) {
                System.out.println("Número " + numero_informado + ": Encontrado");
            } else {
                System.out.println("Número " + numero_informado + ": Não encontrado");
            }
        }
        s.close();
    }

}
