package aula6;

import java.util.Scanner;

public class ValidaCPF {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String cpfInformado, mensagemFlagValidaCPF;
        int[] cpfSeparadoPorDigitos = new int[11];
        int soma, dig1, dig2, resto;

        // Validar CPF - verifica se é um número válido
        System.out.println("============= VALIDA CPF =============");

        // 1ºPasso: Fazer a leitura do CPF do usuário
        System.out.print("\nPor favor, informe o seu CPF: ");
        cpfInformado = entrada.nextLine();

        cpfSeparadoPorDigitos = separaCPFPorDigitos(cpfInformado);

        // 2ºPasso: Somatória das multiplicações de cada elemento
        soma = somatorioDaMultiplicacaoDeCadaElemento(cpfSeparadoPorDigitos, 10);

        // 3ºPasso é verificar o 1º digito
        resto = soma % 11;

        dig1 = verificaDigito(resto);

        // 4º Passo repetir o processo considerando o dig1 encontrado
        soma = somatorioDaMultiplicacaoDeCadaElemento(cpfSeparadoPorDigitos, 11);
        soma += dig1 * 2;

        // 5ºPasso é verificar o 2º digito
        resto = soma % 11;

        dig2 = verificaDigito(resto, dig1);

        // 6º Validar CPF
        mensagemFlagValidaCPF = validaCPF(cpfSeparadoPorDigitos, dig1, dig2);

        System.out.println("Resultado: "+mensagemFlagValidaCPF);

        entrada.close();
    }

    public static int[] separaCPFPorDigitos(String cpf) {
        int[] cpfSeparadoPorDigitos = new int[11];

        int cont = 0;
        int contCPF = 0;
        while (cont < 11) {
            if (!cpf.substring(contCPF, (contCPF+1)).equals("-")) {
                cpfSeparadoPorDigitos[cont] = Integer.parseInt(cpf.substring(contCPF, (contCPF+1)));
                cont++;
            }
            contCPF++;
        }

        return cpfSeparadoPorDigitos;
    }

    public static int somatorioDaMultiplicacaoDeCadaElemento(int[] cpf, int termoMultiplicacao) {
        int soma = 0;
        for(int i = 0; i < 9; i++) {
            soma += cpf[i] * termoMultiplicacao;
            termoMultiplicacao--;
        }
        return soma;
    }

    public static int verificaDigito(int resto) {
        int dig1;

        if(resto  == 0 || resto == 1)
            dig1 = 0;
        else
            dig1 = 11 - resto;

        return dig1;
    }

    public static int verificaDigito(int resto, int dig1) {
        int dig2;

        if(resto  == 0 || resto == 1)
            dig2 = 0;
        else
            dig2 = 11 - resto;

        return dig2;
    }

    public static String validaCPF(int[] cpf, int dig1, int dig2) {
        String mensagem;
        if(dig1 == cpf[9] && dig2 == cpf[10])
            mensagem = "CPF válido.";
        else
            mensagem = "CPF inválido.";

        return mensagem;
    }

}
