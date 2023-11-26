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
public class ex04_slide48 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[][] matriz = new String[3][3];
         for (int i = 0; i < matriz.length; i++) {
            System.out.println("Informe os sabores para a pizza " + (i + 1) + "°");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Sabor " + (j + 1) + ": ");
                matriz[i][j] = s.nextLine();
            }
        }
        System.out.println("\nPedidos e Sabores:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Pedido " + (i + 1) + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

        s.close();
    }
    
}
