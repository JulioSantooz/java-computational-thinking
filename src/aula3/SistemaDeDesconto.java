package aula3;

import java.util.Scanner;

public class SistemaDeDesconto {

    static final String CUPOM = "DESCONTO20";
    static final double VALOR_INICIAL_PARA_DESCONTO = 1000;

    public static void main(String[] args) {
        /* Solicitar para o usuario o valor da compra e o cupom de desconto.
        *  Se o valor >= 1000, tem desconto de 20% ou se o cupom = DESCONTO20,
        * aplicar desconto de 20%. Exiba o valor final da compra
         */
        Scanner entrada = new Scanner(System.in);

        // Variaveis
        double valorCompra, valorFinal = 0;
        String cupomInfoUsuario, flagCupom;

        // Entrada
        System.out.println("******* Mercado do seu zé *******");

        System.out.print("Informe o valor da compra: R$ ");
        valorCompra = entrada.nextDouble();

        // Processamento
        if (valorCompra >= VALOR_INICIAL_PARA_DESCONTO) {
            valorFinal = valorCompra - (valorCompra * 0.20);
        } else {
            System.out.println("Informe 'S' caso tenha cupom ou 'N' caso não tenha cupom");
            flagCupom = entrada.next();

            if (flagCupom.equalsIgnoreCase("S")) {
                System.out.println("Informe o cupom: ");
                cupomInfoUsuario = entrada.next();

                if (cupomInfoUsuario.equals(CUPOM)) {
                    valorFinal = valorCompra - (valorCompra * 0.20);
                } else {
                    System.out.println("Cupom incorreto!");
                    valorFinal = valorCompra;
                }
            } else {
                valorFinal = valorCompra;
            }
        }

        // Saida
        System.out.printf("Total é R$ %.2f", valorFinal);

        entrada.close();
    }
}
