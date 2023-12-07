
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex16 {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

        System.out.print("Informe o valor do lado 1: ");
        double lado_1 = s.nextDouble();

        System.out.print("Informe o valor do lado 2: ");
        double lado_2 = s.nextDouble();

        System.out.print("Informe o valor do lado 3: ");
        double lado_3 = s.nextDouble();

        String resultado = TIPO_TRIANGULO(lado_1, lado_2, lado_3);

        System.out.println("Lado 1: " + lado_1);
        System.out.println("Lado 2: " + lado_2);
        System.out.println("Lado 3: " + lado_3);
        System.out.println("Resultado: " + resultado);

        s.close();
    }

    public static String TIPO_TRIANGULO(double lado_1, double lado_2, double lado_3) {
        if (lado_1 + lado_2 > lado_3 && lado_1 + lado_3 > lado_2 && lado_2 + lado_3 > lado_1) {
            if (lado_1 == lado_2 && lado_1 == lado_3) {
                return "Triângulo Equilátero";
            } else if (lado_1 == lado_2 || lado_1 == lado_3 || lado_2 == lado_3) {
                return "Triângulo Isósceles";
            } else {
                return "Triângulo Escaleno";
            }
        } else {
            return "Não é um triângulo válido";
        }
    }
}