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
            System.out.printf("""
                    Nome do funcionário: %s
                    Salário: R$ %.2f
                    """, funcionario.nome, funcionario.salario);
        }

    }
}
