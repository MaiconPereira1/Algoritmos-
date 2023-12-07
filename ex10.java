/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maico
 */
public class ex10 {

    public static void main(String[] args) {
     
       String nome = "Maicon";
        int ano_nascimento = 1997;

        String transformado = transformar_nome(nome, ano_nascimento);
        System.out.println("Original: " + nome);
        System.out.println("Transformado: " + transformado);
    }

    public static String transformar_nome(String nome, int ano_nascimento) {
        boolean primo = primo(ano_nascimento);

        if (primo) {
            nome = nome.replace('A', '@').replace('a', '@');
            nome = nome.replace('E', '!').replace('e', '!');
        } else {
            nome = nome.replace('E', '#').replace('e', '#');
            nome = nome.replace('O', '*').replace('o', '*');
        }

        return nome;
    }

    public static boolean primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
