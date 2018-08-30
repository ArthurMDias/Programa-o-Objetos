
package modelo;
import java.util.ArrayList;

public class Rota {
        private String nome;
        private ArrayList<Cliente> pontosEntrega;
        private Funcionario  entregador;
        
        public void setNome(String nome){
            this.nome=nome;
        }
        
        public String getNome(){
            return nome;
        }
        //
        
        public void setPontosEntrega(ArrayList<Cliente> clientes){    //PODE TER ALGUM PROBLEMA AQUI!!!
            pontosEntrega=clientes;
        }
        
        public ArrayList<Cliente> getPontosEntrega(){
            return pontosEntrega;
        }
        //
        
        public void setEntregador(Funcionario entregador) {
        this.entregador=entregador;
         }
        
  
        public Funcionario getEntregador(){
            return entregador;
        }

    
}

 