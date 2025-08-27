package SistemaPagamentos;

public class Cliente extends Pessoa{

    public Cliente(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public void realizarPagamento(double valor) {
        if (getSaldo() >= valor){
            reduzirSaldo(valor);
            System.out.printf("%s pago R$ $.2f. Saldo restante: R$ %.2f", getNome(), valor, getSaldo());
        } else {
            System.out.println(getNome() + " não tem saldo suficiente para pagar R$ " + valor);
        }
    }
}
