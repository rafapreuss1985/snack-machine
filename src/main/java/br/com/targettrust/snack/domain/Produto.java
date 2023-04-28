package br.com.targettrust.snack.domain;

public class Produto {

    private Integer codigo;

    private String nome;

    private Float preco;

    public Produto(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isBlank()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome do produto é um campo obrigatório");
        }

    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}' + "\n";
    }
}
