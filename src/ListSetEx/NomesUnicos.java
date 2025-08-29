package ListSetEx;

import java.util.HashSet;
import java.util.Set;

public class NomesUnicos {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();

        nomes.add("Ana");
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Pedro");

        for (String nome : nomes){
            System.out.println(nome);
        }
        if (nomes.contains("João")){
            System.out.println("João está na lista.");
        }else{
            System.out.println("João não está na lista.");
        }
        nomes.remove("Pedro");
        System.out.println(nomes);
        System.out.println("Tamanho da lista: " + nomes.size());

    }
}
