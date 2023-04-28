package br.com.targettrust.snack.interfaces;

public interface IAdquirente {

    void processarTransacao(String numeroCartao, String validade, String ccv);
}
