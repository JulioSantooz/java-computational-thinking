package aula3;

import java.util.Scanner;

public class tipoUsuario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String tipoUsuario;

        System.out.println("Por favor, informe seu tipo de usuário: ");
        tipoUsuario = entrada.next();

        if (!tipoUsuario.equalsIgnoreCase("administrador"))
            System.out.println("Atenção, usuário sem poderes administrativos");
        else
            System.out.println("Usuário com poderes administrativos");

        entrada.close();
    }

}
