package ListSetEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiferencaPratica {
    public static void main(String[] args) {
        List<Integer> numerosList = new ArrayList<>();
        numerosList.add(1);
        numerosList.add(2);
        numerosList.add(2);
        numerosList.add(3);
        numerosList.add(4);
        numerosList.add(4);
        numerosList.add(5);

        Set<Integer> numerosSet = new HashSet<>();

        numerosSet.add(1);
        numerosSet.add(2);
        numerosSet.add(2);
        numerosSet.add(3);
        numerosSet.add(4);
        numerosSet.add(4);
        numerosSet.add(5);

        System.out.println("List");
        for (Integer numero : numerosList){
            System.out.println(numero);
        }
        System.out.println("--------------------");
        System.out.println("Set");
        for (Integer numero : numerosSet){
            System.out.println(numero);
        }
    }
}
