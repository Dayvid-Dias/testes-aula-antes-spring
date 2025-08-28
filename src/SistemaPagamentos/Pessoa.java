package SistemaPagamentos;

public abstract class Pessoa {
    private String nome;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }

    public Pessoa(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }
    public void reduzirSaldo(double valor){
        setSaldo(getSaldo() - valor);
    }

    public abstract void realizarPagamento(double valor, Pagamento forma);

}
