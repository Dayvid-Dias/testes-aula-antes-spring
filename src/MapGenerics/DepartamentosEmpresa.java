package MapGenerics;

import java.util.*;

public class DepartamentosEmpresa {
    public static void main(String[] args) {
        Map<String, List<String>> listaDepartamento = new HashMap<>();
        listaDepartamento.put("TI", new ArrayList<>(Arrays.asList("Dayvid", "Vitor")));
        listaDepartamento.put("RH", new ArrayList<>(Arrays.asList("Marizete", "Marilisa")));
        listaDepartamento.put("Manutenção", new ArrayList<>(Arrays.asList("Diego", "Rogério")));

        for (Map.Entry<String, List<String>> departamento : listaDepartamento.entrySet()){
            System.out.println("Departamento: " + departamento.getKey() + " - Funcionários: " + departamento.getValue());
        }

        listaDepartamento.get("TI").add("Nicolas");
        listaDepartamento.get("RH").add("Lucy");
        listaDepartamento.get("Manutenção").add("Seza");

        System.out.println("\n--------------------------\n");

        for (Map.Entry<String, List<String>> departamento : listaDepartamento.entrySet()){
            System.out.println("Departamento: " + departamento.getKey() + " - Funcionários: " + departamento.getValue());
        }
    }
}
