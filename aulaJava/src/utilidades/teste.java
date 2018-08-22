
package utilidades;

import modelo.CanetaoV1;
import modelo.CanetaoV2;

public class teste {
    public static void main(String[] args) {
        CanetaoV1 ca= new CanetaoV1();
        System.out.println(ca.apresentacao());
        
       CanetaoV2 v2= new CanetaoV2();
       
       v2.cor="preto";
       v2.preco=1.50f;
       v2.marca="BIC";
       v2.descricao="Canetao da secretaria";
       
       CanetaoV2 v21= new CanetaoV2();
       
       v21.cor="azul";
       v21.preco=0.55f;
       v21.marca="BIC";
       v21.descricao="Canetao da secretaria";
       
       
       v21=null;
        System.out.println(v21.apresentacao());
                
    }
}
