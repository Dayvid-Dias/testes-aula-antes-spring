package MapGenerics.Generics;

public class MetodoGenerico {

    public static <T> void imprimirArray(T[] array){
        for (T arr : array){
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        String[] listaNomes = {"felipe", "dayvid","veronica"};
        Integer[] listaNumeros = {1, 2, 3};
        Double[] listaDouble = {1.0, 2.0, 3.0};
        MetodoGenerico.imprimirArray(listaNomes);
        MetodoGenerico.imprimirArray(listaNumeros);
        MetodoGenerico.imprimirArray(listaDouble);
    }
}
