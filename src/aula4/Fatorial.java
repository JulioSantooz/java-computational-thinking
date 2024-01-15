package aula4;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        /*
        * Solicitar um numero para o usuario e calcular o fatorial
        * Exemplo: 4! = 4 * 3 * 2 * 1
         */

        String flagEncerrarPrograma = "s";
        String resultado = "";
        int numFatorial = 0;
        int valorFinal = 1;

        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);

        do {
            System.out.println("*********** FATORIAL ***********");

            System.out.println("Informe um número: ");
            numFatorial = entradaNumero.nextInt();

            for (int cont = numFatorial; cont > 0; cont--) {
                if (cont > 1) {
                    resultado = resultado + cont + " * ";
                } else if (cont == 1){
                    resultado = resultado + cont;
                }
                valorFinal = valorFinal * cont;
            }

            System.out.println(numFatorial + "! = " + valorFinal);
            System.out.println("Caminho para a resposa: " + numFatorial + "! = " + resultado);

            System.out.println("Digite 's', para saber mais resultados fatoriais ou 'n' para sair!");
            flagEncerrarPrograma = entradaTexto.nextLine();

            valorFinal = 1;
            resultado = "";

        } while (flagEncerrarPrograma.equalsIgnoreCase("s") || flagEncerrarPrograma.equalsIgnoreCase("sim"));

        entradaTexto.close();
        entradaNumero.close();
    }

}
