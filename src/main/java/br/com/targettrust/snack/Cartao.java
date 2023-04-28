package br.com.targettrust.snack;

import br.com.targettrust.snack.interfaces.IAdquirente;

import java.util.Scanner;

public class Cartao extends FormaPagamento {

    @Override
    public void realizarPagamento() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número do seu cartão de crédito");
        String numeroCartao = scanner.next();
        System.out.println("Informe o mês e ano do cartao no formato MM/YY");
        String mesAno = scanner.next();
        System.out.println("Informe o CCV");
        String ccv = scanner.next();

        //123456
        //223456
        IAdquirente adquirente = null;
        String primeiroCaracter = numeroCartao.substring(0,1);
        if(primeiroCaracter.equals("1")) {
           adquirente = new Getnet();
        } else if (primeiroCaracter.equals("2")) {
            adquirente = new Rede();
        } else {
            System.out.println("O cartão não é válido");
        }

        adquirente.processarTransacao(numeroCartao, mesAno, ccv);

    }

    @Override
    public void exibirMensagemFinal(String nome) {
        super.exibirMensagemFinal();
        System.out.printf("Obrigada, %s", nome);
    }

}
