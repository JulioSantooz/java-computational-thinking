package aula5;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Variaveis
        double media, soma = 0;
        int qtdNotas = 0;

        String[] nomeAlunos = {"Julio", "Ester", "Evandro"};

        System.out.println("Por favor, informe a quantidade de notas: ");
        qtdNotas = entrada.nextInt();

        double[] notas = new double[qtdNotas];

        // Processamento e Saida
        System.out.println("\nInforme as notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informa a "+ (i+1) +"º nota: ");
            notas[i] = entrada.nextDouble();
            soma = soma + notas[i];
        }

        System.out.println("\nNotas informadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota do(a) "+ nomeAlunos[i] +" = "+notas[i]);
        }

        System.out.println("\nSoma: "+soma);

        media = soma / notas.length;
        System.out.println("\nMédia: "+media);

        entrada.close();
    }
}
