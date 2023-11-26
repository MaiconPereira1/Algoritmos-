/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho2bim;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maico
 */
public class ex03_slide48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner s = new Scanner(System.in);
           int[][] matriz = new int[5][4];
           
           Random ram = new Random();
            for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ram.nextInt(100);
            }
        }
        System.out.println("Matriz Aleatória:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            }
        
            for (int i = 0; i < matriz.length; i++) {
               int soma_colunas = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma_colunas += matriz[i][j];
            }
            System.out.println("Linha " + i + ": Soma das colunas = " + soma_colunas);
        }
        s.close();
    }
    
}
