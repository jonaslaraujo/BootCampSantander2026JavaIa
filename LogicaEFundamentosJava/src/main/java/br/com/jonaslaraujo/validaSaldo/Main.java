package main.java.br.com.jonaslaraujo.validaSaldo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os dois valores inteiros da entrada (saldo e valor da transação)
        System.out.printf("Informe o saldo atual: ");
        int saldo = scanner.nextInt();
        System.out.printf("Informe o valor da transação :");
        int valorTransacao = scanner.nextInt();

        String mensagem = saldo >= valorTransacao ?
                "Transacao aprovada" :
                "Saldo insuficiente";

        System.out.printf(mensagem);

        scanner.close();
    }
}