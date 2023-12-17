package aula3;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //variaveis
        int diaSemana;

        System.out.println("Digite um número de 1 a 7:");
        diaSemana = entrada.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }

        entrada.close();
    }
}
