package br.com.targettrust.snack;

public abstract class FormaPagamento {

    public abstract void realizarPagamento();

    public abstract void exibirMensagemFinal(String nome);

   // public abstract void exibirMensagemFinal();

    public void exibirMensagemFinal() {
        System.out.println("Obrigada. Volte sempre!");

    }

}
