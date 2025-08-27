package SistemaPagamentos;

public class Cliente extends Pessoa{

    public Cliente(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public void realizarPagamento(double valor) {
        if (getSaldo() >= valor){

        }
    }
}
