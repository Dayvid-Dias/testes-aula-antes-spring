package MapGenerics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemPalavra {
    public static void main(String[] args) {
        Map<String, Integer> listaContagem = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String[] frase = sc.nextLine().split(" ");

        for (String f : frase){
            if (listaContagem.containsKey(f)){
                listaContagem.put(f, listaContagem.get(f) + 1);
            } else {
                listaContagem.put(f, 1);
            }
        }

        for (Map.Entry<String, Integer> lista : listaContagem.entrySet()){
            System.out.println(lista);
        }
    }
}
