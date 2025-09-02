package ExceptionsPersonalizada;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println(valor + " foi depositado na conta. Saldo atual: " + saldo);
    }
    public void sacar(double valor) throws SaldoInsuficienteException{
        if (saldo >= valor){
            saldo -= valor;
            System.out.println(valor + " foi sacado da conta. Saldo atual: " + saldo);
        }else {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
    }

}
