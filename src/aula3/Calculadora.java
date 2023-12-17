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

        System.out.println("Informe a opera��o matem�tica desejada: " +
                "\n+ Adi��o" +
                "\n- Subtra��o" +
                "\n/ Divis�o" +
                "\n* Multiplica��o" +
                "Informe a op��o desejada:");
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
                    System.out.println("N�o � poss�vel dividir por zero");
                }
                break;
            case "*":
                mutilplicacao = val1 * val2;
                System.out.println("SOMA = "+ mutilplicacao);
                break;
            default:
                System.out.println("Voc� informou a op��o: "+ operacao + ", � incorreta!");
        }

        entrada.close();
    }
}