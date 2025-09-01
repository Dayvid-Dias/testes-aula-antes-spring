package MapGenerics.Generics;

import java.util.ArrayList;
import java.util.List;

public class Estoque<T> {
    List<T> produtos = new ArrayList<>();

    public void adicionarProduto(T produto){
        produtos.add(produto);
        System.out.println("Produto adicionado.");
    }
    public void removerProduto(T produto){
        produtos.remove(produto);
        System.out.println("Produto removido!");
    }
    public void listarProdutos(){
        System.out.println("lista de produtos: " + produtos);
    }

    public static void main(String[] args) {
        Estoque<String> listaString = new Estoque<>();
        Estoque<Integer> listaInteger = new Estoque<>();

        listaString.adicionarProduto("dayvid");
        listaString.adicionarProduto("davi");
        listaString.adicionarProduto("veronica");
        listaString.removerProduto("davi");
        listaString.listarProdutos();
        System.out.println("--------------------");
        listaInteger.adicionarProduto(2);
        listaInteger.adicionarProduto(3);
        listaInteger.adicionarProduto(24);
        listaInteger.removerProduto(24);
        listaInteger.listarProdutos();

    }
}
