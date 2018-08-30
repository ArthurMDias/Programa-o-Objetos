package modelo;

import java.util.ArrayList;

public class Churrasco {
    String endereco;
    Assador assador;
    ArrayList<Pessoa> participantes=new ArrayList();
    
    ///
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    ///

    public Assador getAssador() {
        return assador;
    }

    public void setAssador(Assador assador) {
        this.assador = assador;
    }
    
    ///

    public ArrayList<Pessoa> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Pessoa> participantes) {
        this.participantes = participantes;
    }
    
    public void addParticipante(Pessoa participante){
        participantes.add(participante);
    }
}
