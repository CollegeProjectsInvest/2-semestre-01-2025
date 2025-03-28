import java.util.Random;
import java.util.Scanner;

class ContaBancaria {
    public int numeroConta;
    public double saldo;
    public String nomeTitular;

    public ContaBancaria(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0;

        Random random = new Random();
        this.numeroConta = random.nextInt(100000);
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo == 0) {
            return;
        }
        this.saldo -= valor;
    }

    public void visualizarSaldo() {
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Nome Titular: " + this.nomeTitular);
        System.out.println("Saldo: R$" + this.saldo);
    }
}

public class Exercicio2 {
    /**
     * Crie uma classe chamada "ContaBancaria" que tenha atributos para o número da conta, saldo e nome do
     * titular. Implementa métodos para depositar, sacar e verificar saldo. Crie objetos de contas bancárias e teste os
     * métodos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco");
        System.out.println("Digite seu nome para cadastro:");
        String nomeTitular = sc.nextLine();

        ContaBancaria contaBancaria = new ContaBancaria(nomeTitular);

        while (true) {
            System.out.println("[1] Sacar\n" +
                    "[2] Depositar\n" +
                    "[3] Visualizar saldo\n" +
                    "[0] Sair");
            int opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Volte sempre!");
                break;
            } else if (opcao == 1) {
                System.out.println("Digite um valor para saque:");
                double valor = sc.nextDouble();
                contaBancaria.sacar(valor);
            } else if (opcao == 2) {
                System.out.println("Digite um valor para depósito:");
                double valor = sc.nextDouble();
                contaBancaria.depositar(valor);
            } else if (opcao == 3) {
                contaBancaria.visualizarSaldo();
            }
        }
    }
}
