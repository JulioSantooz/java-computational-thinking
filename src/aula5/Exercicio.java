package aula5;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        /**
         * Escrever um programa que leia um n�mero n�o determinado de valores e calcule
         * a m�dia aritm�tica dos valores lidos, a quantidade de valores positivos, a
         * quantidade de valores negativos e o percentual de valores negativos e positivos.
         * Mostre os resultados.
         */

        int numero, qtdPositivos = 0, qtdNegativos = 0;
        double percNegativos, percPositivos, soma = 0, media = 0;
        String continuar = "";

        Scanner entradaNumero = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);

        do {
            System.out.println("Digite um n�mero: ");
            numero = entradaNumero.nextInt();

            // Soma para calcular a media aritmetica
            soma += numero;

            //Quantidade de numeros positivos e negativos
            if (numero >= 0) {
                qtdPositivos++;
            } else {
                qtdNegativos++;
            }

            System.out.println("Digite 's' para continuar, ou 'n' para sair");
            continuar = entradaTexto.nextLine();

        } while(continuar.equalsIgnoreCase("s"));

        // Saida de dados

        // Media
        media = soma / (qtdNegativos + qtdPositivos);
        System.out.println("\nA m�dia �: "+media);

        // Quantidade de n�meros positivos e negativos
        System.out.println("\nA quantidade de n�meros positivos digitados foi: "+qtdPositivos);
        System.out.println("A quantidade de n�meros negativos digitados foi: "+qtdNegativos);

        // Percentual de valores positivos e negativos
        percPositivos = (qtdPositivos * 100) / (qtdPositivos + qtdNegativos);
        percNegativos = (qtdNegativos * 100) / (qtdPositivos + qtdNegativos);

        System.out.println("\nO percentual de n�mero positivos, foi: "+percPositivos);
        System.out.println("O percentual de n�mero negativos, foi: "+percNegativos);

        entradaNumero.close();
        entradaTexto.close();
    }

}
