package aula5;

import java.util.Scanner;

public class JuncaoVetor {
    public static void main(String[] args) {

        /*
        * Efetue a leitura de 2 vetores com 6 posi��es cada.
        * Criar um 3� vetor que ser� a jun��o dos dois anteriores.
         */

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[6];
        int[] vetorB = new int[6];
        int[] vetorC = new int[(vetorA.length + vetorB.length)];

        System.out.println("Informe as posi��es do vetor A (N�meros inteiros) ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor "+ (i+1) +"� = ");
            vetorA[i] = entrada.nextInt();
        }

        System.out.println("Informe as posi��es do vetor B (N�meros inteiros) ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Informe o valor "+ (i+1) +"� = ");
            vetorB[i] = entrada.nextInt();
        }

        // Jun��o dos 2 vetores
        for (int i = 0; i < 6; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i + 6] = vetorB[i];
        }

        System.out.println("A jun��o dos dois vetores �: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

        entrada.close();
    }
}
