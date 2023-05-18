package exercicio3;
public class Main {
    public static void main(String[] args) {
        //usanado o construtor com peso defaul
        Pessoa pessoa1 = new Pessoa("Ana",20,1.50);
        Pessoa pessoa2 = new Pessoa("Karla",30,69.5,1.70);
        pessoa1.mostraInformacao();
        System.out.println(" ");
        pessoa2.mostraInformacao();
        System.out.println(" ");

        pessoa1.envelhecer();
        pessoa1.engordar(70);
        pessoa1.emagrecer(5);
        pessoa1.crescer(0.3);

        pessoa2.envelhecer();
        pessoa2.engordar(3);
        pessoa2.emagrecer(5);
        pessoa2.crescer(0.05);

        pessoa1.mostraInformacao();
        System.out.println(" ");
        pessoa2.mostraInformacao();
        System.out.println(" ");
    }
}
