package exercicio5;

public class Carro {
    private int qtdPortas;
    private String marca;
    private String modelo;
    private double potencia;

    public Carro(int qtdPortas, String marca, String modelo) {
        this.qtdPortas = qtdPortas;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = 2.0;
    }

    public Carro(int qtdPortas, String marca, String modelo, double potencia) {
        this.qtdPortas = qtdPortas;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public void ligarCarro(){
        System.out.println("Vrum vrum carro " +getMarca()+" ligado!");
    }

    @Override
    public String toString() {
        return "Quantidade de Portas:" + qtdPortas +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nPotencia:" + potencia;
    }
}
