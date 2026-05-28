package main.java.br.com.jonaslaraujo.saudacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada e separa em nome e tipo de conta
        System.out.println("Informe o nome e o tipo da conta (corrente, poupanca, investimento):");
        String input = scanner.nextLine();
        String[] partes = input.split(" ");

        String nome = partes[0];
        String tipoConta = partes[1];

        if (tipoConta.equalsIgnoreCase("poupanca") ||
                tipoConta.equalsIgnoreCase("corrente") ||
                tipoConta.equalsIgnoreCase("investimento")) {
            System.out.printf("Bem-vindo(a), %s! Sua conta %s esta pronta para uso.", nome, tipoConta.toLowerCase());
        } else {
            System.out.printf("Tipo de conta invalido.");
        }


        scanner.close();
    }
}
