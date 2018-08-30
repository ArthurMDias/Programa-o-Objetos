package modelo;

public class Funcionario {
    private String nome;
    private float salario;
    
    public Funcionario(){ 
    }

    public Funcionario(String nome,float salario){
        this.nome=nome;
        this.salario=salario;
    }
    
    
    //
    
    public void setNome(String nome){
            this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }
    //
    
    public void setSalario(float salario){
        this.salario=salario;
    }
    
    public float getSalario(){
        return salario;
    }
    
}
