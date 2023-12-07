
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[][] matriz_alunos = new String[5][6];

        for (int i = 0; i < matriz_alunos.length; i++) {
            for (int j = 0; j < matriz_alunos[i].length; j++) {
                System.out.print("Informe o nome do aluno na posição [" + i + "][" + j + "]: ");
                matriz_alunos[i][j] = s.nextLine();
            }
        }

        for (int i = 0; i < matriz_alunos.length; i++) {
            for (int j = 0; j < matriz_alunos[i].length; j++) {
                System.out.println("Posição [" + i + "][" + j + "]: " + matriz_alunos[i][j]);
            }
        }

        s.close();
    }
}
