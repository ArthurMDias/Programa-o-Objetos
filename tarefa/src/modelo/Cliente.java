
package modelo;

public class Cliente {
        private String nome;
        private String endereco;
        private String lat;
        private String log;
        
        public void setNome(String nome){
            this.nome=nome;
        }
        
        public String getNome(){
            return nome;
        }        
        //
        public void setEndereco(String endereco){
            this.endereco=endereco;
        }
        
        public String getEndereco(){
            return endereco;
        }
        //
        public void setLatitude(String lat){
            this.lat=lat;
        }
        
        public String getLatitude(){
            return lat;
        }
        //
        public void setLong(String log){
            this.log=log;
        }
        
        public String getLong(){
            return log;
        }
}
