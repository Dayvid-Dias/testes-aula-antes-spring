package Funcionarios;

public abstract class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    abstract double calcularBonus();

    abstract void trabalhar();
}