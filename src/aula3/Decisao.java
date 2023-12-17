package aula3;

import java.util.Scanner;

public class Decisao {
    public static void main(String[] args) {
        /* Ler duas notas de um aluno, calcular a m�dia e verificar se o aluno
        *  foi aprovado (media >= 7), se ele foi reprovado (media < 4) e caso
        *  contrario o aluno est� de exame. Solicitar a nota do exame e verificar
        *  se a nova media for >= 5 aprovado em exame, sen�o esta reprovado.
         */

        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media, notaExame, novaMedia;

        // Entrada
        System.out.print("Digite a primeira nota do aluno:");
        nota1 = entrada.nextDouble();

        System.out.print("\nDigite a segunda nota do aluno:");
        nota2 = entrada.nextDouble();

        // Processamento e saida
        media = (nota1 + nota2) / 2;

        if(media >= 7) {
            System.out.println("Aluno aprovado com m�dia "+media);
        } else if (media < 4) {
            System.out.println("Aluno reprovado com m�dia "+media);
        } else {
            System.out.println("Aluno tem direito a fazer a prova de exame");

            System.out.print("Digite a nota do exame:");
            notaExame = entrada.nextDouble();

            novaMedia = (notaExame + media) / 2;

            if(novaMedia >= 5) {
                System.out.println("Aluno promovido em exame com m�dia "+novaMedia);
            } else {
                System.out.println("Aluno retido ap�s exame com m�dia"+novaMedia);
            }
        }

        entrada.close();
    }
}
