/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex13 {

    public static void main(String[] args) {
          int[][] matriz = {
            {4, 33, 9},
              {4, 67, 6}, 
              {77, 85, 99}
        };

        imprimir_soma(matriz);
    }

    public static void imprimir_soma(int[][] matriz) {
        System.out.println("Soma de cada linha:");

        for (int i = 0; i < matriz.length; i++) {
            int soma_linha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma_linha += matriz[i][j];
            }
            System.out.println("Linha " + i + ": " + soma_linha);
        }
    }
}
