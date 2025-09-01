package MapGenerics.Generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMap {
    public static <K, V> void imprimirMap(Map<K, V> mapa){
        System.out.println("Chave: " + mapa.keySet());
        System.out.println("Valor: " + mapa.values());
    }

    public static void main(String[] args) {
        Map<Integer, String> mapUsuario = new HashMap<>();
        Map<String, Double> mapProduto = new HashMap<>();

        mapUsuario.put(7, "dayvid");
        mapProduto.put("ruffles", 10.50);
        GenericMap.imprimirMap(mapUsuario);
        System.out.println("---------------");
        GenericMap.imprimirMap(mapProduto);
    }
}
