package SistemaPagamentos;

public class Cliente extends Pessoa{
    public Cliente(String nome) {
        super(nome);
    }

    @Override
    public double realizarPagamento(double valor) {
        return 0;
    }
}
