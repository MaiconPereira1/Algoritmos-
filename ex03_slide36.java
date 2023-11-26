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
public class ex03_slide36 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ra_alunos = {
             1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 
            13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
            23, 24, 25, 26, 27, 28, 29, 30, 31, 32,
            33, 34, 35, 36, 37, 38, 39, 40, 41, 42,
            43, 44, 45, 002446, 47, 48, 49, 50};
        System.out.print("Informe o RA: ");
        
        int ra_desejado = s.nextInt();

        boolean presente = false;
        for (int i = 0; i < ra_alunos.length; i++) {
            if (ra_alunos[i] == ra_desejado) {
             presente = true;
             break;
            }
        }
        if (presente) {
            System.out.println("PRESENTE");
        } else {
            System.out.println("AUSENTE");
        }
        s.close();      
    }
    
}
