package SistemaPagamentos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do usuário: ");
        String nome = sc.nextLine();
        System.out.println("Digite o saldo do usuário: ");
        double saldo = sc.nextDouble();

        Cliente cliente = new Cliente(nome, saldo);
        System.out.println("Qual o valor do pagamento?");
        double valor = sc.nextDouble();
        cliente.realizarPagamento(valor, new Boleto());

    }
}
