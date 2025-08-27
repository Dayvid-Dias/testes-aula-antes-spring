package SistemaPagamentos;

public class Cartao  implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento vai Cartão: R$ " + valor);
    }
}
