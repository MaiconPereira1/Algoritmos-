
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex17 {

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);

        System.out.println("Escolha a conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");

        int escolha = s.nextInt();

        if (escolha == 1) {
            System.out.print("Informe a temperatura em Celsius: ");
            double temperatura_celsius = s.nextDouble();
            double temperatura_fahrenheit = fahrenheit(temperatura_celsius);
            System.out.println("Temperatura em Fahrenheit: " + temperatura_fahrenheit + " °F");
        } else if (escolha == 2) {
            System.out.print("Informe a temperatura em Fahrenheit: ");
            double temperatura_fahrenheit = s.nextDouble();
            double temperatura_celsius = celsius(temperatura_fahrenheit);
            System.out.println("Temperatura em Celsius: " + temperatura_celsius + " °C");
        } else {
            System.out.println("Escolha inválida");
        }

        s.close();
    }

    public static double fahrenheit(double temperatura_celsius) {
        return temperatura_celsius * 1.8 + 32.0;
    }

    public static double celsius(double temperatura_fahrenheit) {
        return (temperatura_fahrenheit - 32.0) / 1.8;
    }
}
