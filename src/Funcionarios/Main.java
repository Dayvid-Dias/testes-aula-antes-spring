package Funcionarios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("wally", 4500);
        var desenvolvedor = new Desenvolvedor("dayvidolar", 7500);
        var stage = new Estagiario("dayvipato", 1500);

        List<Funcionario>funcionarios = new ArrayList<>();

        funcionarios.add(gerente);
        funcionarios.add(desenvolvedor);
        funcionarios.add(stage);

        for (Funcionario funcionario : funcionarios){
            double bonus = funcionario.calcularBonus();

            System.out.printf("""
                    Nome do funcionário: %s
                    Salário base: R$ %.2f
                    Bônus: R$ %.2f
                    Salário com bônus: R$ %.2f
                    """,
                    funcionario.nome,
                    funcionario.salario,
                    bonus,
                    funcionario.salario + bonus
            );

            funcionario.trabalhar();
            System.out.println("---------------------");
        }

    }
}
