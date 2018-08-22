
package modelo;

//visibilidade - public
public class Canetao {   //todas palavras da classe começam com letra maiúscula
       String descricao="Canetão da secretaria";
       float preco=1.30f;   //todo número que tem ponto flutuante, no java, é um double, botamos o "f" para dizermos que é float
       String marca="BIC";
      static  String cor="vermelho";
       
     static String escrever(){// as funções são os métodos, os comportamentos, ações do objeto
           return "Eu sou um canetão"+cor;
       }
       
    String apresentacao(){
           return descricao+"Preco: "+ " "+"Marca: "+marca+"Cor: "+cor; // concatenar strings
       }
       
       public static void main(String args[]){ // este aqui é o método principal
          Canetao p1 = new Canetao();
           System.out.println(p1.cor);
           System.out.println(p1.apresentacao());
       }
}
