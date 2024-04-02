package aula6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Familia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<String> listaDeFamilia = new ArrayList<>();
        String itemInformado;

        System.out.println("============ Familia ============");

        listaDeFamilia = criaListaFamilia();

        System.out.println(getListaFamilia(listaDeFamilia));

        System.out.println(getListaFamiliaOrdemAlfabetica(listaDeFamilia));

        entrada.close();
    }

    public static List<String> criaListaFamilia() {
        Scanner entrada = new Scanner(System.in);

        List<String> listaDeFamilia = new ArrayList<>();
        String itemInformado;

        do {
            System.out.println("Informe o nome de um familiar, ou digite 's' para sair: ");
            itemInformado = entrada.next();
            if (!itemInformado.equalsIgnoreCase("s"))
                listaDeFamilia.add(itemInformado);
        } while (!itemInformado.equalsIgnoreCase("s"));

        return listaDeFamilia;
    }

    public static String getListaFamilia(List<String> listaFamilia) {
        String lista = "Lista da familia: ";

        for (String familiar: listaFamilia) {
            lista = lista + "\n- " + familiar;
        }

        return lista;
    }

    public static String getListaFamiliaOrdemAlfabetica(List<String> listaFamilia) {
        String lista = "Lista da familia em ordem alfabética: ";

        Collections.sort(listaFamilia);

        for (String familiar: listaFamilia) {
            lista = lista + "\n- " + familiar;
        }

        return lista;
    }
}
