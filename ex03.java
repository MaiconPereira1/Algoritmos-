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
public class ex03 {

    public static void main(String[] args) {
         String[] nome_usuario = new String[5];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome: ");
            nome_usuario[i] = s.nextLine();
        }

        System.out.println("Nomes informados em ordem:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "° " + nome_usuario[i]);
        }
        s.close();
    }
    
}
