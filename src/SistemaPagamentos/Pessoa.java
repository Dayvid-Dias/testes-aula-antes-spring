package SistemaPagamentos;

public abstract class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract double realizarPagamento(double valor);

}
