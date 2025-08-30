package MapGenerics.Generics;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaSimples<T> {
    private List<T> itens = new ArrayList<>();

    public void guardar(T item){
        itens.add(item);
        System.out.println("O item " + item + " foi guardado!");
    }

    public T abrir(int index) {
        return itens.get(index);
    }

    public static void main(String[] args) {
        ClasseGenericaSimples<String> caixaString = new ClasseGenericaSimples<>();
        caixaString.guardar("travesseiro");
        caixaString.guardar("Cobertor");

        System.out.println("Abrindo item 0: " + caixaString.abrir(0));

        ClasseGenericaSimples<Integer> caixaInteger = new ClasseGenericaSimples<>();
        caixaInteger.guardar(123);
        caixaInteger.guardar(456);

        System.out.println("Abrindo item 1: " + caixaInteger.abrir(1));
    }
}
/*
Proposta do exercício:

Classe Genérica Simples

Crie uma classe Caixa<T> com métodos:

guardar(T item) → guarda o item

abrir() → retorna o item

Crie 2 caixas:

Caixa<String> → guarde e imprima uma String

Caixa<Integer> → guarde e imprima um Integer
*/
