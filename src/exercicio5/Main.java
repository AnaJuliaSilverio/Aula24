package exercicio5;

public class Main {
    public static void main(String[] args) {
        Carro carroFiat = new Carro(4,"Fiat","Mobi");
        Carro carroJeep = new Carro(4,"Jeep","Renegade",3);

        System.out.println("Informacao Carros");
        System.out.println(carroFiat.toString());
        System.out.println(" ");
        System.out.println(carroJeep.toString());
        System.out.println(" ");

        carroFiat.ligarCarro();
        carroJeep.ligarCarro();

    }
}
