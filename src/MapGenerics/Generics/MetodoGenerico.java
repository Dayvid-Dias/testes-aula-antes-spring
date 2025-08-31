package MapGenerics.Generics;

public class MetodoGenerico {

    public static <T> void imprimirArray(T[] array){
        for (T arr : array){
            System.out.println(arr);
        }
    }

    public static void main(String[] args) {
        String[] listaNomes = {"felipe", "dayvid","veronica"};
        MetodoGenerico.imprimirArray(listaNomes);
    }
}
