package terfaArray;

import java.sql.SQLOutput;
import java.util.*;

public class TafArray2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dgitite o sem e o nome (utilize - para separar eles e utilize , para separar dos outros)");
        String insertDados = s.nextLine();

        String[] separDados = insertDados.split(",");

        Map<String, List<String>> juntNomes = new TreeMap();

        for (String colet : separDados) {
            String[] separ = colet.split("-");
            String nome = "";
            String sexo = "";

            if (separ.length == 2) {
                nome = separ[0];
                sexo = separ[1].toUpperCase();

                juntNomes.computeIfAbsent(sexo, k -> new ArrayList<>()).add(nome);
            }
            }


        System.out.println("Lista de nomes por sexo:");

        for (Map.Entry<String, List<String>> entry : juntNomes.entrySet()) {
            String sexo = entry.getKey();
            List<String> nomes = entry.getValue();

            System.out.println(sexo + ":");
            for (String nome : nomes) {
                System.out.println(" " + nome);
            }

        }
    }
}