package br.com.giovanni.escolha;

import java.util.Scanner;

public class EscolhaDaOpcao {
    public String opcaoEscolhida(Scanner scanner) {
        String opcao;

        do {
            System.out.println("Escolha 'c' para continuar ou 's' para sair: ");
            opcao = scanner.next();

            if (!opcao.equalsIgnoreCase("c") && !opcao.equalsIgnoreCase("s")) {
                System.out.printf("'%s' é uma opção inválida, tente novamente\n", opcao);
            }
        } while (!opcao.equalsIgnoreCase("c") && !opcao.equalsIgnoreCase("s"));
        return opcao;
    }
}
