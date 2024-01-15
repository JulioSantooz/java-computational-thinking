package aula4;

import java.util.Scanner;

public class MediaAlturaLoopDeterminado {

    public static void main(String[] args) {

        // Solicitar a altura dos alunos de uma turma e tirar a m�dia de altura da sala

        System.out.println("Aula 04 - La�os");

        Scanner entrada = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);

        double altura, media, somaAltura = 0;
        int numeroAlunosTurma = 0;
        String continuar = "s";

        do {
            media = 0;

            System.out.println("Por favor, informe a quantidade de alunos da turma: ");
            numeroAlunosTurma = entrada.nextInt();

            for (int cont = 1; cont <= numeroAlunosTurma; cont++) {
                System.out.println("Digite a altura do " + cont + "� aluno: ");
                altura = entrada.nextDouble();
                somaAltura = somaAltura + altura;
            }

            media = somaAltura / numeroAlunosTurma;
            System.out.println("A m�dia de altura dos alunos � de " + media);

            System.out.println("Deseja cadastrar a m�dia de altura dos alunos de outra turma? ");
            continuar = entradaTexto.nextLine();
        } while (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));

        entrada.close();
        entradaTexto.close();
    }
}
