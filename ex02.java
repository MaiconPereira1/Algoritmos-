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
public class ex02 {

    public static void main(String[] args) {
        double[] notas = new double[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = s.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / 10;

        double menor_nota = notas[0];
        double maior_nota = notas[0];
        for (int i = 1; i < 10; i++) {
            if (notas[i] < menor_nota) {
                menor_nota = notas[i];
            }
            if (notas[i] > maior_nota) {
                maior_nota = notas[i];
            }
        }
        System.out.println("Média da sala: " + media);
        System.out.println("Menor nota: " + menor_nota);
        System.out.println("Maior nota: " + maior_nota);

        s.close();
    }

}
