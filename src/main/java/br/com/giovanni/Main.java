package br.com.giovanni;

import br.com.giovanni.escolha.EscolhaDaOpcao;
import br.com.giovanni.formula.FormulaDaMultiplicacao;
import br.com.giovanni.mensagens.Mensagens;
import br.com.giovanni.numero.EscolhaDoNumero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String escolha;
        var mensagem = new Mensagens();
        var escolhaDoNumero = new EscolhaDoNumero();
        var multiplicacao = new FormulaDaMultiplicacao();
        var opcao = new EscolhaDaOpcao();

        mensagem.bemVindo();

        do{
            int numero = escolhaDoNumero.numeroEscolhido(leitor);
            multiplicacao.formula(numero);
            escolha = opcao.opcaoEscolhida(leitor);
        }while(escolha.equalsIgnoreCase("c"));

        mensagem.encerramento();
        leitor.close();
    }
}