
package modelo;


public class CanetaoV2 {
     public String descricao;
     public float preco;   
     public String marca;
     public String cor;
     
     private  String escrever(){
           return "Eu sou um canetão"+cor;
       }
       
    public String apresentacao(){
           return descricao+" Preco: "+ " "+" Marca: "+marca+" Cor: "+cor+escrever();
           
       }
}
