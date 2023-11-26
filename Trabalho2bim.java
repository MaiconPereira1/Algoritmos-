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
public class Trabalho2bim {

    public static void main(String[] args) {

        double[] notas = new double[4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota do " + (i + 1) + "° bimestre: ");
            notas[i] = s.nextDouble();
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / 4;

        System.out.println("A média do aluno é: " + media);

        s.close();
    }
}
