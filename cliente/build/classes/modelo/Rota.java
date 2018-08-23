
package modelo;
import java.util.ArrayList;

public class Rota {
    private String nome;
    private ArrayList<Cliente> pontosEntrega; //dentro do meu arraylist só vai ter obejetos da classe "Cliente"
    
    //
    //
    
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    //
    //
           
    public void setPontosEntrega(ArrayList<Cliente> clientes){
        pontosEntrega=clientes;
    }
    
    public ArrayList<Cliente> getPontosEntrega(){
        return pontosEntrega;
    }
}