
package utilidade;

import modelo.Cliente;
import modelo.Rota;
import java.util.ArrayList;

public class teste {
    public static void main(String args[]){  //para ser executado
        Cliente c1=new Cliente();
        
        c1.setNome("Wagner");
        c1.setRua("Rua Floriano peixoto");
        c1.setNumero(40);
        c1.setCpf("99999");
        
        Cliente c2=new Cliente("035.943.090-29");
        
        
        Cliente c3=new Cliente("Arthur", "99999");
        
        
        ArrayList<Cliente> clientes= new ArrayList<Cliente>();
        
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        
        Rota rota=new Rota();
        rota.setNome("Centro/Camobi");
        rota.setPontosEntrega(clientes); 
        imprimeRota(rota);
    }
         private static void imprimeRota(Rota rota){
         
         for(int x=0;x<rota.getPontosEntrega().size();x++){
             Cliente c=rota.getPontosEntrega().get(x);
             System.out.println(c.getNome());
         }
            
        }
}
