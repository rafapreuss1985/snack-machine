package br.com.targettrust.snack;

import br.com.targettrust.snack.domain.Fileira;
import br.com.targettrust.snack.domain.Maquina;

import java.util.Scanner;

public class FluxoAtendimento {

    public void executar(Maquina snackMachine) {

        System.out.println("## Fluxo de atendimento:");

        System.out.println("Informe o código do produto");

        Scanner scanner = new Scanner(System.in);
        Integer codigo = scanner.nextInt();

        Fileira fileira = snackMachine.getFileiras().get(codigo);
        if (fileira != null) {
            // A máquina informa o nome do produto e o valor, solicitando o pagamento.
            System.out.println("Produto: " + fileira.getProduto().getNome());
            System.out.println("Valor: R$ " + fileira.getProduto().getPreco());

            System.out.println("Qual será a forma de pagamento?");
            System.out.println("Se for cartão de crédito/débito, informe 1");
            System.out.println("Se for dinheiro, informe 2");

            int formaPagamento = scanner.nextInt();

            FormaPagamento pagamento = null;

            if(formaPagamento == 1) {
                pagamento = new Cartao();

            } else if(formaPagamento == 2) {
                pagamento = new Dinheiro();
            }

            pagamento.realizarPagamento();

            //pagamento.exibirMensagemFinal();
            pagamento.exibirMensagemFinal("Marcia");

            System.out.println();
            //String mensagem = pagamento.mostrarMensagem();
            //System.out.println(mensagem);

            System.out.println();

        } else {
            System.out.println("O código informado é inválido!");
        }
    }
}
