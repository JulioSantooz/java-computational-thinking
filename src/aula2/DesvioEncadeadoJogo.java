package aula2;

import java.util.Scanner;

public class DesvioEncadeadoJogo {
    public static void main(String[] args) {

        /*Uma ONG criou um jogo para alertar as pessoas sobre os riscos das drogas.
         *Por se tratar de um assunto sens�vel, ficou decidido que a idade m�nima para jogar � de 12 anos.
         *Sua fun��o � criar um programa que receba a idade do usu�rio e exiba a mensagem "Voc� pode jogar"
         * caso ele tenha 12 anos ou mais. */

        Scanner leitor = new Scanner(System.in);
        int idade;

        // Entrada
        System.out.println("Por favor, digite a sua idade: ");
        idade = leitor.nextInt();

        System.out.println("Deixe-me verificar sua idade...");

        // Processamento e saida
        if(idade < 12) {
            System.out.println("Voc� n�o pode jogar, pois � menor de 12 anos");
        } else if(idade >= 18) {
            System.out.println("Voc� pode jogar");
        } else {
            System.out.println("Voc� pode jogar com autoriza��o do respons�vel.");
        }

        leitor.close();
    }
}
