package aula1;

import java.util.Scanner;
public class Dois {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Informe a sua idade: ");
        idade = entrada.nextInt();

        System.out.println("A sua idade é "+idade);

        entrada.close();
    }

}
