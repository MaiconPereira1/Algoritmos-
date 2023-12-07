/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex15 {

    public static void main(String[] args) {
      double valor_original = 243;
        double taxa = 4.1; 
        int dias_atrasados = 23;

        double valor_atual = VALOR_ATUAL(valor_original, taxa, dias_atrasados);

        System.out.println("Valor original: R$" + valor_original);
        System.out.println("Taxa de juros: " + taxa + "%");
        System.out.println("Dias atrasados: " + dias_atrasados + " dias");
        System.out.println("Valor atualizado: R$" + valor_atual);
    }

    public static double VALOR_ATUAL(double valor_original, double taxa, int dias_atrasados) {
        double valor_atual = valor_original + (valor_original * (taxa / 100) * dias_atrasados);
        return valor_atual;
    }
}