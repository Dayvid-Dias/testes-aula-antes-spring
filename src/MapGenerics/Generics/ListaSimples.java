package MapGenerics.Generics;

import java.util.ArrayList;
import java.util.List;

public class ListaSimples {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("dayvid");
        nomes.add("Veronica");
        nomes.add("Davi");

        for (String nome : nomes){
            System.out.println("Nome: " +nome);
        }
    }
}
/* Proposta do exercício:
        Lista Simples

Crie uma List genérica de Strings chamada nomes.

Adicione 3 nomes.

Imprima todos os nomes usando for-each.

Tente adicionar um número (ex.: 123) e veja o erro do compilador.*/
