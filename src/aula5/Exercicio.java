package aula5;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        /**
         * Escrever um programa que leia um número não determinado de valores e calcule
         * a média aritmética dos valores lidos, a quantidade de valores positivos, a
         * quantidade de valores negativos e o percentual de valores negativos e positivos.
         * Mostre os resultados.
         */

        int numero, qtdPositivos = 0, qtdNegativos = 0;
        double percNegativos, percPositivos, soma = 0, media = 0;
        String continuar = "";

        Scanner entradaNumero = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
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
        System.out.println("\nA média é: "+media);

        // Quantidade de números positivos e negativos
        System.out.println("\nA quantidade de números positivos digitados foi: "+qtdPositivos);
        System.out.println("A quantidade de números negativos digitados foi: "+qtdNegativos);

        // Percentual de valores positivos e negativos
        percPositivos = (qtdPositivos * 100) / (qtdPositivos + qtdNegativos);
        percNegativos = (qtdNegativos * 100) / (qtdPositivos + qtdNegativos);

        System.out.println("\nO percentual de número positivos, foi: "+percPositivos);
        System.out.println("O percentual de número negativos, foi: "+percNegativos);

        entradaNumero.close();
        entradaTexto.close();
    }

}
