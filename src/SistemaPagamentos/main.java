package SistemaPagamentos;

public class main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("dayvidolas", 1000);

        cliente.realizarPagamento(450, new Pix());
        cliente.realizarPagamento(250, new Boleto());

    }
}
