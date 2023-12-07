
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex11 {

    public static void main(String[] args) {
        
         int[][] matriz = new int[4][5];
         
        Scanner s = new Scanner(System.in);
        System.out.println("Insira os 20 primeiros números ímpares:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Posição [" + i + "][" + j + "]: ");
                matriz[i][j] = s.nextInt();
            }
        }
        System.out.println("Matriz com os números inseridos:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        s.close();
    }
}
