
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex07 {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome_produto = s.nextLine();

        String nome_valido = validar_nome(nome_produto);

        if (nome_valido != null) {
            System.out.println("Nome do produto válido: " + nome_valido);
        } else {
            System.out.println("O nome do produto deve ter pelo menos 10 caracteres.");
        }

        s.close();
    }
    public static String validar_nome(String nome) {
        if (nome.length() >= 10) {
            return nome;
        } else {
            return null;
        }
    }
}