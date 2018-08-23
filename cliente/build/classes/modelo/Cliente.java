
package modelo;


public class Cliente {    //quando criamos uma classe ele já com o método construtuor
    private String nome;
    private String rua;
    private int numero;
    private String cpf;
    
    public Cliente(){
        
    }
    
    public Cliente(String cpf){ //método construtor
        setCpf(cpf);
    }
    
    public Cliente(String nome,String cpf){
        this.cpf=cpf;
        this.nome=nome;
    }
    
   //estrutura básica dos métodos set e get
    
   public void setNome(String nome){
       this.nome=nome;
   }
   
   public String getNome(){
       return nome;
   }
   
   //
   
   public void setRua(String rua){
       this.rua=rua;
   }
   
   public String getRua(){
       return rua;
   }
   
   //
   
   
   public void setNumero(int numero){
       this.numero=numero;
   }
   
   public int getNumero(){
       return numero;
   }
   
   //
   
   public void setCpf(String cpf){
        this.cpf=cpf;
   }
   
   public String getCpf(){
       return cpf;
   }
   
}
