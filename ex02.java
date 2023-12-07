
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
            int num_1 = s.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
            int num_2 = s.nextInt();

        if (num_1 > num_2) {
                System.out.println("O primeiro número é maior que o segundo.");
            } else if (num_1 < num_2) {
                System.out.println("O primeiro número é menor que o segundo.");
            } else {
                System.out.println("Os dois números são iguais.");
            }
        
        
        s.close();
    }
    
}
