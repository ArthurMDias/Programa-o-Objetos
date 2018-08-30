package modelo;

import java.util.ArrayList;

public class Area {
    private String nome;
    private ArrayList<Rota> rotas=new ArrayList();
    private Funcionario colaborador;

    public Area() {
        
    }
    
    public Area(String nome){
        this.nome=nome;
    }
    
    public Area(String nome,Funcionario colaborador){
        this.nome=nome;
        this.colaborador=colaborador;
    }
    
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }
    ///
    ///
    public void setRotas(ArrayList<Rota> rotas){
        this.rotas=rotas;
    }
    
    public ArrayList<Rota> getRotas(){
        return rotas; 
    }
    ///
    ///
    public void setColaborador(Funcionario colaborador){
        this.colaborador=colaborador;
    }
    
    public Funcionario getColaborador(){
        return colaborador;
    }
    
    public void addRota(Rota rota){
        rotas.add(rota);
    }
}
