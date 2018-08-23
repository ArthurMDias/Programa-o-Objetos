
package modelo;


public class Cliente {
    public String nome;
    public String rua;
    public String cpf;
    
    boolean comprar(){
        return true;
    }
    
  public  String apresentacao(){
       return "Nome: "+nome+"\n"+"Rua: "+rua+"\n"+"CPF: "+cpf;
   }
}
