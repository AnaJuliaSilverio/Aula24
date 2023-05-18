package exercicio6;

public class Quadrado {
    private double tamanhoLado;

    public Quadrado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }
    public double cacularArea(){
        double area = 2*getTamanhoLado();
        return area;
    }
    public void desenhaQuadrado() {
        int valor = (int) Math.round(getTamanhoLado());
        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                if (i==0||i==valor-1||j==0||j==valor-1){
                    System.out.print("- ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

    }

}
