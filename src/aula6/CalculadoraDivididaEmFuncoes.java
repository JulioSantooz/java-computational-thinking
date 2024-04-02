package aula6;

import java.util.Scanner;

public class CalculadoraDivididaEmFuncoes {

    static String resultado;
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao;
        int[] valores = new int[2];
        String sair;

        do {
            opcao = menu(entrada);

            switch (opcao) {
                case 1:
                     valores[0] = digitarValor(entrada);
                     valores[1] = digitarValor(entrada);
                case 2:
                    soma(valores);
                    break;
                case 3:
                    subtracao(valores);
                    break;
                case 4:
                    divisao(valores);
                    break;
                case 5:
                    multiplicacao(valores);
                    break;
                case 6:
                    sair();
                    break;
                default:
                    exibirResultado("Opção Inválida!");
            }
        } while (opcao != 6);

        entrada.close();
    }

    public static int menu(Scanner entrada) {
        int opcao;

        System.out.println("CALCULADORA");
        System.out.println("=====================");
        System.out.println("1 - Digitar valores");
        System.out.println("2 - Realizar a soma");
        System.out.println("3 - Realizar a subtração");
        System.out.println("4 - Realizar a divisão");
        System.out.println("5 - Realizar a multiplicação");
        System.out.println("6 - Sair");

        System.out.println("\nDigite uma das opções: ");
        opcao = entrada.nextInt();

        return opcao;
    }

    public static int digitarValor(Scanner entrada) {
        int numero;

        System.out.println("Informe um número: ");
        numero = entrada.nextInt();

        return numero;
    }

    public static void soma(int[] valores){
        int soma;
        soma = valores[0] + valores[1];

        resultado = valores[0]+" + "+valores[1]+" = "+soma;
        exibirResultado(resultado);
    }

    public static void subtracao(int[] valores){
        int subtracao;
        subtracao = valores[0] - valores[1];

        resultado = valores[0]+" - "+valores[1]+" = "+subtracao;
        exibirResultado(resultado);
    }

    public static void divisao(int[] valores){
        int divisao = 0;

        if (valores[0] == 0) {
            resultado = "Não é possível dividir por zero, voltando para menu!";
        }
        else {
            divisao = valores[0] / valores[1];
            resultado = valores[0]+" / "+valores[1]+" = "+divisao;
        }

        exibirResultado(resultado);
    }

    public static void multiplicacao(int[] valores){
        int multiplicacao;
        multiplicacao = valores[0] * valores[1];

        resultado = valores[0]+" * "+valores[1]+" = "+multiplicacao;
        exibirResultado(resultado);
    }

    public static void exibirResultado(String resultado) {
        System.out.println("\nResultado: "+resultado);
    }

    public static void sair() {
        System.out.println("Encerrando programa!");
    }
}
