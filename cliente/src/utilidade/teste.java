
package utilidade;

import modelo.Cliente;

public class teste {
    public static void main(String args[]){
        Cliente cliente1= new Cliente(); 
        
        cliente1.nome="Maria Joaquina";
        cliente1.rua="Rua Duque de Caxias";
        cliente1.numero=825;
        cliente1.cpf="999.999.555-55";
        
        System.out.println(cliente1.apresentacao());
    }
}
