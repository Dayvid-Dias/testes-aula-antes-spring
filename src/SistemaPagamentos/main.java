package SistemaPagamentos;

public class main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Jubiscleudo", 5000);

        cliente.realizarPagamento(3500, new Boleto());

    }
}
