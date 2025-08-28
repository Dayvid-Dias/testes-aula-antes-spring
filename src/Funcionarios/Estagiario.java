package Funcionarios;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        return salario * 0.05;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está aprendendo e ajudando!");
    }
}