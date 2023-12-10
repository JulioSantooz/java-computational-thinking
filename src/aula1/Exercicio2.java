package aula1;
import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {
        /*
        *   Um funcionario da ONG do exercicio anterior realiza o trabalho de buscar alimentos diariamente no
        * Mercado Municipal utilizando um carro. É importante que a ONG saiba quantos quilômetros por litro
        * esse carro faz. Crie um programa em que o usuário digite quantos quilômetros o painel do carro
        * mostra no inicio de uma viagem, quanto quilômetros ele mostra na chegada ao posto de gasolina e
        * quantos litros foramreabastecidos. O programa deve calcular e exibir a média de quilômetros por litro
        * que o veículo faz.
         */

        double kmInicial, kmFinal, qtdLitros, consumo;

        Scanner entrada = new Scanner(System.in);
        // Entrada
        System.out.println("Informe quantos quilometros o marcador indicava no início da viagem: ");
        kmInicial = entrada.nextDouble();

        System.out.println("Informe quantos quilometros o marcador indicava na chegada ao posto: ");
        kmFinal = entrada.nextDouble();

        System.out.println("Informe quantos litros de combustível foram reabastecidos: ");
        qtdLitros = entrada.nextDouble();

        // Processamento
        consumo = (kmFinal - kmInicial) / qtdLitros;

        // Saida
        System.out.println("O consumo do veículo foi "+ consumo + " km/l");

        entrada.close();
    }
}
