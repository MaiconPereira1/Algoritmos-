
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex19 {

    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);

        String[] cidades = {"São Paulo", "Curitiba", "Brasília", "Natal", "Recife"};

        int[][] tempo_viagem = {
                {0, 50, 300, 450, 400},
                {50, 0, 200, 350, 300},
                {300, 200, 0, 175, 60},
                {450, 350, 175, 0, 30},
                {400, 300, 60, 30, 0}
        };

        System.out.println("Escolha o primeiro destino (1 a 5): ");
        int primeiro_destino = s.nextInt();

        System.out.println("Escolha o segundo destino (1 a 5): ");
        int segundo_destino = s.nextInt();

        int minutos_viagem = tempo_viagem[primeiro_destino - 1][segundo_destino - 1];
        int horas = minutos_viagem / 60;
        int minutos = minutos_viagem % 60;

        System.out.println("Tempo de viagem de " + cidades[primeiro_destino - 1] + " para " + cidades[segundo_destino - 1] +
                ": " + horas + " horas e " + minutos + " minutos");

        System.out.print("Deseja calcular o tempo total de viagem? (S/N): ");
        char opcao = s.next().charAt(0);

        if (opcao == 'S' || opcao == 's') {
            System.out.println("Escolha o terceiro destino (1 a 5): ");
            int terceiro_destino = s.nextInt();

            int minutos_viagem_segundo_terceiro = tempo_viagem[segundo_destino - 1][terceiro_destino - 1];
            int horas_segundo_terceiro = minutos_viagem_segundo_terceiro / 60;
            int minutos_segundo_terceiro = minutos_viagem_segundo_terceiro % 60;

            int tempo_total_minutos = minutos_viagem + minutos_viagem_segundo_terceiro;
            int tempo_total_horas = tempo_total_minutos / 60;
            int tempo_total_minutos_resto = tempo_total_minutos % 60;

            System.out.println("Tempo de viagem de " + cidades[segundo_destino - 1] + " para " + cidades[terceiro_destino - 1] +
                    ": " + horas_segundo_terceiro + " horas e " + minutos_segundo_terceiro + " minutos");

            System.out.println("Tempo total de viagem: " + tempo_total_horas + " horas e " + tempo_total_minutos_resto + " minutos");
        }

        s.close();
    }
}