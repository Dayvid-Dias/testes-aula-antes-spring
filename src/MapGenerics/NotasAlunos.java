package MapGenerics;

import java.util.*;

public class NotasAlunos {
    public static void main(String[] args) {
        Map<String, List<Double>> mapAlunoNota = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println("Digite as notas do aluno separadas por espaço: ");
            String[] notasStr = sc.nextLine().split(" ");

            List<Double> notas = new ArrayList<>();
            for (String nota : notasStr){
                notas.add(Double.parseDouble(nota));
            }
            mapAlunoNota.put(nome, notas);
        }
        for (int i = 1; i <= mapAlunoNota.size(); i++) {
            System.out.println();
        }
    }
}
