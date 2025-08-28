package Funcionarios;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        return salario * 0.20;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está gerenciando a equipe!");
    }
}