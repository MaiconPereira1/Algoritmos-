
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author maicon
 */
public class ex01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Sua nota final no ano letivo: ");
        double ultima_nota = s.nextDouble();

        if (ultima_nota > 6.0) {
            System.out.println("Aprovado!");
        } else if (ultima_nota > 4.0) {
            System.out.println("Precisa fazer prova substitutiva.");
        } else {
            System.out.println("Reprovado.");
        }

        s.close();
    }

}
