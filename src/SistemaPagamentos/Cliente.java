package SistemaPagamentos;

public class Cliente extends Pessoa{

    public Cliente(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public void realizarPagamento(double valor, Pagamento forma) {
        if (getSaldo() >= valor) {
            reduzirSaldo(valor);
            forma.pagar(valor);
            System.out.printf("%s pagou R$ %.2f. Saldo restante: R$ %.2f%n",
                    getNome(), valor, getSaldo());
        } else {
            System.out.println(getNome() + " não tem saldo suficiente para pagar R$ " + valor);
        }
    }
}
