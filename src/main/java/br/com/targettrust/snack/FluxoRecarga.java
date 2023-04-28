package br.com.targettrust.snack;

import br.com.targettrust.snack.domain.Fileira;
import br.com.targettrust.snack.domain.Maquina;
import br.com.targettrust.snack.domain.Produto;
import br.com.targettrust.snack.enumerations.FileiraStatus;
import br.com.targettrust.snack.exceptions.FileiraInvalidaException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FluxoRecarga {

    public Map<Integer, Fileira> executar() throws Exception {

        Map<Integer, Fileira> fileiras = new HashMap<>();

        String path = System.getProperty("user.dir");
        String caminhoArquivo = path + File.separator + "snack.txt";

        //String caminhoArquivo = "/home/marcia_castagna/IdeaProjects/snack-machine/src/main/resources/snack.txt";

        FileReader fileReader = new FileReader(caminhoArquivo);
        BufferedReader br = new BufferedReader(fileReader);

        System.out.println("## Fluxo de recarga");
        System.out.println("Atendente fazendo a recarga da Snack Machine");
        try {
            String linha;
            int quantidadeFileiras = 0;
            while ((linha = br.readLine()) != null) {

                //System.out.println(linha);

                String[] informacoes = linha.split(";");

                Produto produto = new Produto(Integer.parseInt(informacoes[0]));
                produto.setNome(informacoes[1]);
                produto.setPreco(Float.valueOf(informacoes[2]));

                Fileira fileira = new Fileira();
                fileira.setProduto(produto);
                fileira.setQuantidade(Integer.parseInt(informacoes[3]));
                fileira.setStatus(FileiraStatus.COM_PRODUTO);

                quantidadeFileiras++;

                if(quantidadeFileiras > Maquina.NUMERO_MAXIMO_FILEIRAS) {
                    throw new FileiraInvalidaException("Não é possível inserir mais esta fileira");
                }

                fileiras.put(produto.getCodigo(), fileira);

                //System.out.println(produto);

            }
        } finally {
            br.close();
            fileReader.close();
        }

        return fileiras;
    }


}
