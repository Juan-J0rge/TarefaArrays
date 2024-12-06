package terfaArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TafArray1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite nomes separados por virgula");
        String botanomes = s.nextLine();

        String[] nomesArrays = botanomes.split(",");

        List<String> nomesOrdm = new ArrayList();
        for (String nome : nomesArrays  ) {
            nomesOrdm.add(nome);
        }

        Collections.sort(nomesOrdm);

        System.out.println("\nNomes ordenados");
        for (String nome: nomesOrdm) {
            System.out.println(nome);

        }




    }
}
