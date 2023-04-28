package br.com.targettrust.snack.domain;

import br.com.targettrust.snack.domain.Produto;
import br.com.targettrust.snack.enumerations.FileiraStatus;

public class Fileira {

    private Produto produto;

    private Integer quantidade;

    private FileiraStatus status;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public FileiraStatus getStatus() {
        return status;
    }

    public void setStatus(FileiraStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Fileira{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                ", status=" + status +
                '}' + "\n";
    }
}
