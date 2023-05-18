package exercicio3;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso = 0;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = 0;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void envelhecer(){
        if (getIdade()<21){
            setAltura(getAltura()+0.5);
        }
        setIdade(getIdade()+1);
    }
    public void engordar(double peso){
        setPeso(getPeso()+peso);
    }
    public void emagrecer(double peso){
        setPeso(getPeso()-peso);
    }
    public void crescer(double altura){
        setAltura(getAltura()+altura);
    }
    public void mostraInformacao(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Peso: "+getPeso());
        System.out.println("Altura: "+getAltura());
    }
}
