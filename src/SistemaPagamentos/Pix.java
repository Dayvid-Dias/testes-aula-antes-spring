package SistemaPagamentos;

public class Pix implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via Pix: R$ " + valor);
    }
}
