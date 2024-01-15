package aula4;

import java.util.Scanner;

public class Media {

    public static  void main (String[] args) {

        System.out.println("******* MEDIA *******");

        System.out.println("Informe duas notas válidas para que seja feito o calculo");
        System.out.println("Obs: notas validálidas estão entre 0 e 10.");

        double nota1 = 0.0;
        double nota2 = 0.0;
        double resultado = 0.0;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Informe a primeira nota: ");
            nota1 = entrada.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.println("Informe a segunda nota: ");
            nota2 = entrada.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        resultado = (nota1 + nota2) / 2;

        System.out.println("O resultado de "+nota1+" + "+nota2+" = "+resultado);

        entrada.close();
    }

}
