package aula3;

import java.util.Scanner;

public class Senha {

    static final String USUARIO = "root";
    static final String SENHA = "root123";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String usuario, senha;

        // Entrada
        System.out.println("****** Sistema acad�mico --- FIAP-ON******");

        System.out.print("Por favor, digite seu usuario: ");
        usuario = entrada.nextLine();

        System.out.print("Por favor, digite sua senha: ");
        senha = entrada.nextLine();

        // Processamento e saida
        usuario = usuario.trim();
        senha = senha.trim();

        if (usuario.equals(USUARIO) && senha.equals(SENHA))
            System.out.println("Bem vindo ao sistema FIAP-ON");
        else
            System.out.println("Usu�rio e/ou senha inv�lida!");

        entrada.close();
    }
}
