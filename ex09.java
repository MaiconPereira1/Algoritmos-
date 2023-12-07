

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author maicon
 */
public class ex09 {

    public static void main(String[] args) {
        
        String codigo_ncm = "841";

        if (Informatica_ncm(codigo_ncm)) {
            System.out.println("O NCM " + codigo_ncm + " esta relacionado à informática.");
        } else {
            System.out.println("O NCM " + codigo_ncm + " não é relacionado à informática.");
        }
    }

    public static boolean Informatica_ncm(String ncm) {
        String[] lista_ncm = {
          "8471", "8471.30", "8471.41", "8471.49", "8517"    
        };

        for (String informatica_ncm : lista_ncm) {
            if (ncm.startsWith(informatica_ncm)) {
                return true;
            }
        }

        return false;
    }
}