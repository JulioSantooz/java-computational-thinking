package aula3;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        double val1, val2, soma, subtracao, mutilplicacao, divisao;
        String operacao;

        Scanner entrada = new Scanner(System.in);

        System.out.println("*********** Calculadora ***********");

        // Entrada
        System.out.println("Informe o primeiro valor: ");
        val1 = entrada.nextDouble();

        System.out.println("Informe a operação matemática desejada: " +
                "\n+ Adição" +
                "\n- Subtração" +
                "\n/ Divisão" +
                "\n* Multiplicação" +
                "Informe a opção desejada:");
        operacao = entrada.next();

        System.out.println("Informe o segundo valor: ");
        val2 = entrada.nextDouble();

        // Processamento
        switch (operacao) {
            case "+":
                soma = val1 + val2;
                System.out.println("SOMA = "+ soma);
                break;
            case "-":
                subtracao = val1 - val2;
                System.out.println("SOMA = "+ subtracao);
                break;
            case "/":
                if (val2 > 0) {
                    divisao = val1 / val2;
                    System.out.println("SOMA = "+ divisao);
                } else {
                    System.out.println("Não é possível dividir por zero");
                }
                break;
            case "*":
                mutilplicacao = val1 * val2;
                System.out.println("SOMA = "+ mutilplicacao);
                break;
            default:
                System.out.println("Você informou a opção: "+ operacao + ", é incorreta!");
        }

        entrada.close();
    }
}