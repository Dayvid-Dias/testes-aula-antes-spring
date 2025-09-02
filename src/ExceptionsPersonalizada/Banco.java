package ExceptionsPersonalizada;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    List<Conta> listaContas = new ArrayList<>();

    public void adicionarConta(Conta conta){
        listaContas.add(conta);
        System.out.println("Conta adicionada!");
    }

    public Conta buscarConta(int numeroConta) throws ContaNaoEncontradaException {
        for (Conta c : listaContas) {
            if (c.getNumero() == numeroConta) {
                return c;
            }
        }
        throw new ContaNaoEncontradaException("Conta não encontrada: " + numeroConta);
    }

    public void transferir(int numeroOrigem, int numeroDestino, double valor)
            throws ContaNaoEncontradaException, SaldoInsuficienteException {

        Conta origem = buscarConta(numeroOrigem);
        Conta destino = buscarConta(numeroDestino);

        if (origem.getSaldo() >= valor) {
            origem.sacar(valor);
            destino.depositar(valor);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para transferência!");
        }
    }
}
