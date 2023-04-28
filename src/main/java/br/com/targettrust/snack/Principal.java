package br.com.targettrust.snack;

import br.com.targettrust.snack.domain.Fileira;
import br.com.targettrust.snack.domain.Maquina;
import br.com.targettrust.snack.enumerations.MaquinaStatus;

import java.util.Map;


public class Principal {


    public static void main(String[] args) throws Exception {

        Maquina snackMachine = new Maquina();
        snackMachine.setStatus(MaquinaStatus.DISPONIVEL);

        // TODO validar status da maquina

        FluxoRecarga recarga = new FluxoRecarga();
        Map<Integer, Fileira> fileiras = recarga.executar();
        snackMachine.setFileiras(fileiras);

        for (Map.Entry<Integer, Fileira> fileira : snackMachine.getFileiras().entrySet()) {
            System.out.println(fileira.getKey() + " - " + fileira.getValue());
        }

        FluxoAtendimento atendimento = new FluxoAtendimento();
        atendimento.executar(snackMachine);

    }
}
