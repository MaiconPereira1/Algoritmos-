
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex04 {

    public static void main(String[] args) {
              int[] vetor = new int[30];
        
        Random ram = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ram.nextInt(100);
        }
        int somar_valor = 0;
        for (int valor : vetor) {
            somar_valor += valor;
        }
        int menor_valor = vetor[0];
        int maior_valor = vetor[0];
        for (int valor : vetor) {
            if (valor < menor_valor) {
                menor_valor = valor;
            }
            if (valor > maior_valor) {
                maior_valor = valor;
            }
        }
        System.out.println(">RESULTADO:");
        System.out.println("Soma: " + somar_valor);
        System.out.println("Menor: " + menor_valor);
        System.out.println("Maior: " + maior_valor);
        System.out.print("Vetor[0]:" + vetor[0]);
        System.out.print(" |Vetor[9]:" + vetor[9]);
        System.out.print(" |Vetor[19]:" + vetor[19]);
        System.out.print(" |Vetor[29]:" + vetor[29]);
    }
    
}
