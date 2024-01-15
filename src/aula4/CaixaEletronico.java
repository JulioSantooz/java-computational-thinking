package aula4;

import java.util.Scanner;

public class CaixaEletronico {

    public static final double VALOR_MINIMO = 10.00;

    public static void main(String[] args) {

        /*
         * 1 - Abertura de uma conta => nome do cliente, saldo inicial. Se n�o existir cadastro
         * 2 - Exibir saldo => mostrar o saldo
         * 3 - Depositar => Solicitar um valor e alterar o saldo (+)
         * 4 - Sacar => Solicitar um valor e alterar o saldo (-). Se houver saldo
         * 5 - Sair
         */

        String nomeCliente = "", flagNomeDeCliente = "";
        double saldoDaConta = 0, flagValor = 0;
        int flagMenu;

        Scanner entradaDeNumero = new Scanner(System.in);
        Scanner entradaDeTexto = new Scanner(System.in);

        do {
            System.out.println("\n**************** CAIXA ELETR�NICO ****************\n");
            System.out.println("Op��es: " +
                    "\n1 - Abertura de conta" +
                    "\n2 - Exibir saldo" +
                    "\n3 - Depositar" +
                    "\n4 - Sacar" +
                    "\n5 - Sair\n");

            System.out.println("Informe a op��o: ");
            flagMenu = entradaDeNumero.nextInt();

            switch (flagMenu) {
                case 1: // Abertura de uma conta
                    System.out.println("**************** Abertura de conta ****************");
                    System.out.println("Obs: O valor m�nimo para abertura de conta � R$ 10,00.");

                    System.out.println("Informe o seu nome para cadastro: ");
                    flagNomeDeCliente = entradaDeTexto.nextLine();

                    if (!flagNomeDeCliente.equalsIgnoreCase(nomeCliente)) {
                        nomeCliente = flagNomeDeCliente;

                        System.out.println("Informe a quantia para abertura de conta R$ ");
                        flagValor = entradaDeNumero.nextDouble();

                        if (flagValor >= VALOR_MINIMO) {
                            saldoDaConta = flagValor;
                            System.out.println("Conta criada com sucesso!");
                        } else {
                            System.out.println("Valor abaixo do m�nimo para a abertura da conta.");
                            nomeCliente = "";
                        }
                    } else {
                        System.out.println("Conta j� existente com este nome de usu�rio");
                    }
                    break;
                case 2: // Exibir saldo
                    System.out.println("**************** Exibir Saldo ****************");
                    System.out.println("Informe o seu nome: ");
                    flagNomeDeCliente = entradaDeTexto.nextLine();

                    if (!flagNomeDeCliente.equalsIgnoreCase(nomeCliente)) {
                        System.out.println("N�o existe conta cadastrada com o nome informado");
                    } else {
                        System.out.println("Ol� "+nomeCliente+", o seu saldo � R$ "+saldoDaConta+".");
                    }
                    break;
                case 3: // Depositar
                    System.out.println("**************** Depositar ****************");
                    System.out.println("Informe o seu nome: ");
                    flagNomeDeCliente = entradaDeTexto.nextLine();

                    if (!flagNomeDeCliente.equalsIgnoreCase(nomeCliente)) {
                        System.out.println("N�o existe conta cadastrada com o nome informado");
                    } else {
                        System.out.println("Informe o valor para depositar R$ ");
                        flagValor = entradaDeNumero.nextDouble();

                        if (flagValor <= 0) {
                            System.out.println("Erro ao depositar, o valor informado � menor ou igual a R$ 00,00");
                        } else {
                            saldoDaConta = saldoDaConta + flagValor;

                            System.out.println("Voc� acaba de depositar R$ "+flagValor+".");
                            System.out.println("O seu saldo atual � R$ "+saldoDaConta+".");
                        }
                    }
                    break;
                case 4: // Sacar
                    System.out.println("**************** Sacar ****************");
                    System.out.println("Informe o seu nome: ");
                    flagNomeDeCliente = entradaDeTexto.nextLine();

                    if (!flagNomeDeCliente.equalsIgnoreCase(nomeCliente)) {
                        System.out.println("N�o existe conta cadastrada com o nome informado");
                    } else {
                        System.out.println("Informe o valor para sacar R$ ");
                        flagValor = entradaDeNumero.nextDouble();

                        if (flagValor <= 0) {
                            System.out.println("Erro ao sacar, o valor informado � menor ou igual a R$ 00,00");
                        } else {
                            saldoDaConta = saldoDaConta - flagValor;

                            System.out.println("Voc� acaba de sacar R$ "+flagValor+".");
                            System.out.println("O seu saldo atual � R$ "+saldoDaConta+".");
                        }
                    }
                    break;
                case 5: // Sair
                    System.out.println("At� logo!");
                    flagMenu = 5;
                    break;
                default:
                    System.out.println("Valor inv�lido");
                    break;
            }
        } while(flagMenu != 5);

        entradaDeNumero.close();
        entradaDeTexto.close();
    }
}