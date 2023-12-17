package aula3;

import java.util.Scanner;

public class Rodizio {
    public static void main(String[] args) {

        /* Ler os números referente a placa de um carro xxx-9999
        exibir usando o switch o dia do rodizio de veiculos.
        * 1 e 2 - segunda-feira
        * 3 e 4 - terça-feira
        * 5 e 6 - quarta-feira
        * 7 e 8 - quinta-feira
        * 9 e 0 - sexta-feira
         */

        Scanner entrada = new Scanner(System.in);

        // Variaveis
        int placa, finalPlaca;

        // Entrada
        System.out.println("Digite os números da placa do seu automóvel: ");
        placa = entrada.nextInt();

        // Processamento
        finalPlaca = placa % 10;

        // Saida
        switch (finalPlaca) {
            case 1:
            case 2:
                System.out.println("Rodizio de Segunda-Feira");
                break;
            case 3:
            case 4:
                System.out.println("Rodizio de Terça-Feira");
                break;
            case 5:
            case 6:
                System.out.println("Rodizio de Quarta-Feira");
                break;
            case 7:
            case 8:
                System.out.println("Rodizio de Quinta-Feira");
                break;
            case 9:
            case 0:
                System.out.println("Rodizio de Sexta-Feira");
                break;
            default:
                System.out.println("Placa incorreta");
                break;
        }

        /*
        * Nas versoes de Java mais recentes, podemos chamar varios casos com o lambda, assim:
        * case 1, 2 -> System.out.println("Segunda-feira");
         */

        entrada.close();
    }
}
