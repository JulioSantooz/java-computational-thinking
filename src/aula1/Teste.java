package aula1;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int idade;

        Scanner entrada = new Scanner(System.in);

        // Entrada
        System.out.println("Informe a sua idade: ");
        idade = entrada.nextInt();

        //Processamento e saida
        System.out.println("A sua idade é: "+idade);

        entrada.close();
    }
}
