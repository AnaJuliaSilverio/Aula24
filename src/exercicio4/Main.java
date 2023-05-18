package exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor;
        Scanner sc = new Scanner(System.in);
        ContaCorrente contaCorrente1 = new ContaCorrente("Ana Julia",5000);
        ContaCorrente contaCorrente2 = new ContaCorrente("Luana Baler");

        System.out.println(contaCorrente1.toString());
        System.out.println(" ");
        System.out.println(contaCorrente2.toString());
        System.out.println(" ");
        if (!(contaCorrente1.saqueConta(7000))){
            System.out.println("Essa quantidade é maior que seu saldo atual!");
            System.out.println(" ");
        }else {
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo Atual: "+contaCorrente1.getSaldo());
            System.out.println(" ");
        }
        contaCorrente2.depositoConta(1000);
        System.out.println("Saldo Atual: "+contaCorrente2.getSaldo());


    }
}
