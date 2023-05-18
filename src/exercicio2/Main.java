package exercicio2;

public class Main {
    public static void main(String[] args) {
        Bola adidas = new Bola(12.58,"Azul","Adidas","plastico",13.45);
        Bola camelo = new Bola(15,"Amarela","Sem marca","plastico",10);
        Bola nike = new Bola(13,"Preta","Nike","plastico",18);

        //trocando e mostrando cor
        System.out.println("Cor da bola "+adidas.getMarca()+": "+adidas.getCor());
        adidas.setCor("Roxa");
        System.out.println("Nova cor da bola "+adidas.getMarca()+": "+adidas.getCor());
        System.out.println(" ");

        System.out.println("Cor da bola "+camelo.getMarca()+": "+camelo.getCor());
        camelo.setCor("Azul");
        System.out.println("Nova cor da bola "+camelo.getMarca()+": "+camelo.getCor());
        System.out.println(" ");

        System.out.println("Cor da bola "+nike.getMarca()+": "+nike.getCor());
        nike.setCor("Pink");
        System.out.println("Nova cor da bola "+nike.getMarca()+": "+nike.getCor());
        System.out.println(" ");

        //imprimindo informacoes de todas as bolas
        adidas.mostraInformacao();
        System.out.println(" ");
        camelo.mostraInformacao();
        System.out.println(" ");
        nike.mostraInformacao();


    }
}
