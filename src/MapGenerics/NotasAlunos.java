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
        System.out.println("\nNotas e médias dos alunos:");
        for (Map.Entry<String, List<Double>> entry : mapAlunoNota.entrySet()) {
            String nome = entry.getKey();
            List<Double> notas = entry.getValue();

            // cálculo da média
            double soma = 0.0;
            for (Double n : notas) {
                soma += n;
            }
            double media = soma / notas.size();

            System.out.println(nome + " -> " + notas + " | Média: " + media);
        }
        sc.close();
    }
}
