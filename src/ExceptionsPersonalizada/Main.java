package ExceptionsPersonalizada;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Conta c1 = new Conta(1, "Dayvid", 1000);
        Conta c2 = new Conta(2, "Maria", 500);
        Conta c3 = new Conta(3, "João", 300);

        // Adicionar contas ao banco
        banco.adicionarConta(c1);
        banco.adicionarConta(c2);
        banco.adicionarConta(c3);

        System.out.println("\n--- Testando depósitos ---");
        c1.depositar(200); // saldo deve virar 1200
        c2.depositar(100); // saldo deve virar 600

        System.out.println("\n--- Testando saques ---");
        try {
            c1.sacar(1300); // deve lançar SaldoInsuficienteException
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            c2.sacar(400); // deve funcionar, saldo vira 200
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n--- Testando transferências ---");
        try {
            banco.transferir(1, 2, 500); // Dayvid transfere 500 para Maria
        } catch (ContaNaoEncontradaException | SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            banco.transferir(2, 4, 100); // conta inexistente, deve lançar ContaNaoEncontradaException
        } catch (ContaNaoEncontradaException | SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\n--- Saldo final ---");
        System.out.println(c1.getTitular() + ": " + c1.getSaldo());
        System.out.println(c2.getTitular() + ": " + c2.getSaldo());
        System.out.println(c3.getTitular() + ": " + c3.getSaldo());
    }
}
