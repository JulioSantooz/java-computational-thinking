package aula1;
import java.util.Scanner;

public class Exercicio1 {

    static final double COTACAO = 4.87;

    public static void main(String[] args) {

        /*
        * Ocasionalmente a ONG para a qual você trabalha recebe doações e dólar e precisa saber qual
        * é o valor em reais. Crie um programa que permita que o usuário digite o valor da doação em
        * dólares, converta esse valor para reais e exiba o resultado na tela.
         */

        double valorDolar, valorConvertidoReal;

        Scanner entrada = new Scanner(System.in);

        // Entrada
        System.out.println("Informe o valor da doação:");
        valorDolar = entrada.nextDouble();

        // Processamento
        valorConvertidoReal = valorDolar * COTACAO;

        // Saida
        System.out.printf("Sua doação em reais foi R$ %.2f.",valorConvertidoReal);

        entrada.close();
    }
}
