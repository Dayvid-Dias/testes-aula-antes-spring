package MapGenerics.Generics;

import java.util.ArrayList;
import java.util.List;

public class CaixaList<T> {
    List<T> lista = new ArrayList<>();

    public void adicionar(T item){
        lista.add(item);
        System.out.println(item + " foi adicionado!");
    }
    public void pegar(int index){
        System.out.println("Item solicitado: " + lista.get(index));
    }
    public void tamanho(){
        System.out.println("Tamanho da lista: " + lista.size());
    }

    public static void main(String[] args) {
        CaixaList<String> listaString = new CaixaList<>();
        CaixaList<Integer> listaInt = new CaixaList<>();

        listaString.adicionar("veronica");
        listaString.adicionar("dayvid");
        listaString.adicionar("Davi");
        listaInt.adicionar(3);
        listaInt.adicionar(2);
        listaInt.adicionar(1);
        listaString.pegar(2);
        listaInt.pegar(2);
        listaString.tamanho();
        listaInt.tamanho();
    }
}
