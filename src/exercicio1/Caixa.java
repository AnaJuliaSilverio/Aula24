package exercicio1;

public class Caixa {
    private double saldo;

    public Caixa() {
        this.saldo = 1000;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void credito(double valor){
        setSaldo(getSaldo()+valor);
    }
    public void debito(double valor){
        setSaldo(getSaldo()-valor);
    }
    public boolean verificaDebeito(double valor){
        if (valor>getSaldo()){
            return false;
        }else return true;
    }
}
