/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho2bim;

import java.util.Scanner;

/**
 *
 * @author maicon
 */
public class ex04_slide36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] codigos = {1, 2, 3, 4, 5};
        double[] precos = {19.90, 12.90, 25.90, 23.89, 17.79};
        
        System.out.print("Informe o código do produto:");
        
        int codigo_informado = s.nextInt();
        
        boolean detectado = false;
           for(int i = 0; i<codigos.length; i++){
           if(codigos[i] == codigo_informado){
           detectado = true;
           System.out.println("R$" + precos[i]);
           break;
           }
         }
           if (!detectado) {
            System.out.println("Código não encontrado.");
        }
        
        s.close();
    }
    
}
