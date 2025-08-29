package ListSetEx;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    public static void main(String[] args) {
        List<String> listaCompras = new ArrayList<>();

        listaCompras.add("carne");
        listaCompras.add("morango");
        listaCompras.add("ovo");
        listaCompras.add("carne");
        listaCompras.add("atum");

        for (String compras : listaCompras){
            System.out.println(compras);
        }
        System.out.println("Tamanho da lista: " + listaCompras.size());
        System.out.println("item do índice 2: " + listaCompras.get(2));
        listaCompras.remove("morango");
    }
}
