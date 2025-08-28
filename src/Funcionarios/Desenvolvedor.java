package Funcionarios;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        return salario * 0.10;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está codando um sistema!");
    }
}