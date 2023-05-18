package exercicio4;

import java.util.Random;

public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
        this.numeroConta = geraNumero();
    }

    public ContaCorrente(String nomeCorrentista, double saldo) {
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean saqueConta(double valor){
        if (valor>getSaldo()) return false;
        else{
            setSaldo(getSaldo()-valor);
            return true;
        }
    }
    public void depositoConta(double valor){
        setSaldo(getSaldo()+valor);
    }
    public static int geraNumero(){
        Random geradorDoDado = new Random();
        //gerando um numero de 1 a 6
        return geradorDoDado.nextInt(1900)+1900;
    }

    @Override
    public String toString() {
        return "Tipo da conta: Conta Corrente\n" +
                "Numero da Conta: " + numeroConta +
                "\nNome do Correntista: " + nomeCorrentista +
                "\nSaldo atual:" + saldo;
    }
}
