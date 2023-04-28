package br.com.targettrust.snack.domain;

import br.com.targettrust.snack.enumerations.MaquinaStatus;

import java.util.Map;

public class Maquina {

    public static final Integer NUMERO_MAXIMO_FILEIRAS = 12;

    private Map<Integer, Fileira> fileiras;

    private MaquinaStatus status;

    public Map<Integer, Fileira> getFileiras() {
        return fileiras;
    }

    public void setFileiras(Map<Integer, Fileira> fileiras) {
        this.fileiras = fileiras;
    }

    public MaquinaStatus getStatus() {
        return status;
    }

    public void setStatus(MaquinaStatus status) {
        this.status = status;
    }
}
