package aula1;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        // Leitura de 2 valores para fazer as operacoes aritmeticas

        int valor1, valor2, soma, subtracao, multiplicacao;
        double divisao;

        Scanner entrada = new Scanner(System.in);

        // Entrada
        System.out.print("************** CALCULADORA **************\n");

        System.out.println("Informe o primeiro valor: ");
        valor1 = entrada.nextInt();

        System.out.println("Informe o segundo valor: ");
        valor2 = entrada.nextInt();

        // Processamento
        soma = valor1 + valor2;
        System.out.println("A soma de "+valor1+" + "+ valor2+" = "+soma);

        subtracao = valor1 - valor2;
        System.out.println("A soma de "+valor1+" - "+ valor2+" = "+subtracao);

        multiplicacao = valor1 * valor2;
        System.out.println("A soma de "+valor1+" * "+ valor2+" = "+multiplicacao);

        divisao = valor1 / valor2;
        if (valor1 % 2 == 1) {
            divisao = (double) valor1 / valor2;
        } else if (valor2 % 2 == 1) {
            divisao = valor1 / (double) valor2;
        }
        System.out.println("A soma de "+valor1+" / "+ valor2+" = "+divisao);


        entrada.close();
    }
}

