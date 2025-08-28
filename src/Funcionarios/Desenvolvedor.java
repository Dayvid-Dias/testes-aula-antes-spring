package Funcionarios;

public class Desenvolvedor extends Funcionario implements Trabalhavel{
    double bonus;

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        bonus = salario * 0.10;
        System.out.println("Salário com bônus: R$ " + (salario + bonus));
        return bonus;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está trabalhando!");
    }
}
