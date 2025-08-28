package SistemaPagamentos;

public class Boleto implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via Boleto: R$ " + valor);
    }
}
