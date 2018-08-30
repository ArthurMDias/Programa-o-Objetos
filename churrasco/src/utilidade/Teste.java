package utilidade;

import modelo.Pessoa;
import modelo.Churrasco;
public class Teste {
    public static void main(String args[]){
        Pessoa participante1=new Pessoa("William", 6.5f);
        Pessoa participante2=new Pessoa("Marcone",8.67f);
        Pessoa participante3=new Pessoa("Márcio",5.54f);
        
        Churrasco churrasco=new Churrasco();
        
        churrasco.addParticipante(participante1);
        churrasco.addParticipante(participante2);
        churrasco.addParticipante(participante3);
        
    }
}
