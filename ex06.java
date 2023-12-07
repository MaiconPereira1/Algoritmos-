/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex06 {

    public static void main(String[] args) {
        String texto = "frase demonstrativa de poucas palavras.";
        int valor = 5;

        String sub_texto = obter_sub_texto(texto, valor);

        System.out.println("Texto original: " + texto);
        System.out.println("Subtexto até a posição " + valor + ": " + sub_texto);
    }

    public static String obter_sub_texto(String texto, int valor) {
        if (valor >= 0 && valor <= texto.length()) {
            return texto.substring(0, valor);
        } else {
            System.out.println("Valor meio alto, né? Deixe-me mostrar o texto inteiro.");
            return texto;
        }
    }
}
