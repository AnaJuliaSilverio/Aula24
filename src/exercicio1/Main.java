package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caixa caixa = new Caixa();
        double valor;
        System.out.println("Bem vindo ao caixa");
        System.out.println("Quantos lançamentos deseja fazer?");
        int numeroLancamentos = sc.nextInt();

        for (int i = 0; i < numeroLancamentos; i++) {
            System.out.println("1-Para realizar um crédito");
            System.out.println("2-Para realizar um debito");
            int opcao = sc.nextInt();
            if (opcao == 1){
                System.out.println("Digite o valor a ser adicionado: ");
                valor = sc.nextDouble();
                caixa.credito(valor);
            } else if (opcao==2) {
                System.out.println("Digite o valor a ser retirado: ");
                valor = sc.nextDouble();
                while (!(caixa.verificaDebeito(valor))){
                    System.out.println("Esse valor esta acima do seu saldo!");
                    System.out.println("Digite o valor novamente: ");
                    valor = sc.nextDouble();
                }
            }
        }
        System.out.println(caixa.getSaldo());
    }
}
