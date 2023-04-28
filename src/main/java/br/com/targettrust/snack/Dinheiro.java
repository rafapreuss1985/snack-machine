package br.com.targettrust.snack;

public class Dinheiro extends FormaPagamento {

    @Override
    public void realizarPagamento() {

        System.out.println("Insira o dinheiro");

        // TODO calcular o troco e devolver para o usuário

        System.out.println("Retire seu troco");

    }

    @Override
    public void exibirMensagemFinal(String nome) {
        System.out.printf("Obrigada pela verdinha, %s", nome);
    }
}
