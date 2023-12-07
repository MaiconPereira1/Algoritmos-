
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex08 {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String descricao_produto = s.nextLine();

        System.out.print("Digite a parte da descrição: ");
        String parte_da_descricao = s.nextLine();

        boolean resultado = buscar_descricao(descricao_produto ,parte_da_descricao );

        if (resultado) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso.");
        }

        s.close();
    }

    public static boolean buscar_descricao(String descricao_produto, String parte_da_descricao) {
        return descricao_produto.contains(parte_da_descricao);
    }
}
   
