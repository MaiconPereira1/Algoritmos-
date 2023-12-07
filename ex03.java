
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex03 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
            int informe_num = s.nextInt();

        if (informe_num % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        s.close();
    }
    
}
