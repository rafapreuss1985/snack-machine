package br.com.targettrust.snack;

import br.com.targettrust.snack.interfaces.IAdquirente;

public class Getnet implements IAdquirente {



    @Override
    public void processarTransacao(String numeroCartao, String validade, String ccv) {
        System.out.println("Transação sendo realizada pela GETNET");


    }
}
