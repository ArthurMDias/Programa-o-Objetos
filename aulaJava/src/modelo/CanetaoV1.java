package modelo;


public class CanetaoV1 {
      String descricao="Canetão da secretaria";
      float preco=1.30f;   //todo número que tem ponto flutuante, no java, é um double, botamos o "f" para dizermos que é float
      String marca="BIC";
      static  String cor="vermelho";
       
     static String escrever(){// as funções são os métodos, os comportamentos, ações do objeto
           return "Eu sou um canetão"+cor;
       }
       
    public String apresentacao(){
           return descricao+" Preco: "+ " "+" Marca: "+marca+" Cor: "+cor; // concatenar strings
       }
}
