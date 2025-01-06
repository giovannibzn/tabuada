package br.com.alura.numero;

import java.util.Scanner;

public class EscolhaDoNumero {
    public int numeroEscolhido(Scanner scanner){
        int numero = 0;
        boolean validacao = false;

        while(!validacao){
            System.out.println("Escolha um núemro para ser multiplicado: ");
            if(scanner.hasNextInt()){
                numero = scanner.nextInt();
                validacao = true;
            } else{
                System.out.println("Opção inválida, escolha um núemro inteiro.");
                scanner.next();
            }
        }
        return numero;
    }
}
