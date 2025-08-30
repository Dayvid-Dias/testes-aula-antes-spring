package MapGenerics;

import java.util.HashMap;
import java.util.Map;

public class CadastroProduto {
    public static void main(String[] args) {
        Map<Integer, String> mapProduto = new HashMap<>();
        mapProduto.put(1, "ps5");
        mapProduto.put(2, "ps4");
        mapProduto.put(3, "ps3");
        mapProduto.put(4, "ps2");
        mapProduto.put(5, "ps1");

        for (Map.Entry<Integer, String> produto : mapProduto.entrySet()){
            System.out.println("ID = " + produto.getKey() + " - Produto = " + produto.getValue());
        }

        mapProduto.remove(1);
        System.out.println("--------------  Após a remoção pelo ID ---------------");

        for (Map.Entry<Integer, String> produto : mapProduto.entrySet()){
            System.out.println("ID = " + produto.getKey() + " - Produto = " + produto.getValue());
        }
        if (mapProduto.containsKey(1)){
            System.out.println("Contém ID 1");
        }else{
            System.out.println("não contém ID 1");
        }

        if (mapProduto.containsValue("ps5")){
            System.out.println("Contém ps5");
        }else{
            System.out.println("Não contém ps5");
        }

    }
}
