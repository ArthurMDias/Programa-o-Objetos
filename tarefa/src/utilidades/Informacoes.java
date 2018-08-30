
package utilidades;

import modelo.Area;
import modelo.Cliente;
import modelo.Funcionario;
import modelo.Rota;


import java.util.ArrayList;

public class Informacoes {
        public static void main(String args[]){
                Cliente cliente1= new Cliente();
                Cliente cliente2=new Cliente();
                Cliente cliente3=new Cliente();
                Cliente cliente4=new Cliente();
                
                cliente1.setNome("Ademir Josías");
                cliente1.setEndereco("Rua Floriano Peixoto, 50");
                cliente1.setLatitude("15° 46′ 47″ Sul");
                cliente1.setLong("47° 55′ 47″ Oeste");
                
                cliente2.setNome("Carla dos Santos");
                cliente2.setEndereco("Rua Duque de Caxias, 930");
                cliente2.setLatitude("15° 49′ 53″ Sul");
                cliente2.setLong("47° 52′ 49″ Oeste");
                
                cliente3.setNome("Mário Gonçalves");
                cliente3.setEndereco("Rua Restinga Seca, 999");
                cliente3.setLatitude("15° 45′ 69″ Norte");
                cliente3.setLong("47° 76′ 88″ Leste");
                
                cliente4.setNome("Joselina Maria");
                cliente4.setEndereco("Rua João Goulart, 56");
                cliente4.setLatitude("15° 67′ 58″ Norte");
                cliente4.setLong("47° 32′ 99″ Leste");
                
                
                ArrayList<Cliente> clientesCentro=new ArrayList();
                ArrayList<Cliente> clientesCamobi=new ArrayList();
                
                clientesCentro.add(cliente1);
                clientesCentro.add(cliente2);
                clientesCamobi.add(cliente3);
                clientesCamobi.add(cliente4);
                ////
                
                Funcionario entgCentro=new Funcionario();
                Funcionario entgCamobi=new Funcionario();
                ArrayList <Funcionario> funcionarios=new ArrayList();
                
                entgCentro.setNome("Pedro Azevedo");
                entgCentro.setSalario(2000);
                
                entgCamobi.setNome("Arnaldo César");
                entgCamobi.setSalario(2000);
                
                Funcionario colaborador=new Funcionario();
                
               colaborador.setNome("Fernado Maranghello");
               colaborador.setSalario(2500);
               
               funcionarios.add(entgCentro);
               funcionarios.add(entgCamobi);
               funcionarios.add(colaborador);
                
                ////
                
                Rota rota1=new Rota();
                Rota rota2=new Rota();
                
                rota1.setNome("Centro");
                rota1.setEntregador(entgCentro);
                rota1.setPontosEntrega(clientesCentro);
                
                
                rota2.setNome("Camobi");
                rota2.setEntregador(entgCamobi);
                rota2.setPontosEntrega(clientesCamobi);
                
               
               ///
                Area area1=new Area("Centro/Camobi", colaborador);
                area1.addRota(rota1);
                area1.addRota(rota2);
                ///
                
                imprimirArea(area1);
        }
        
        public static void imprimirClientes(ArrayList <Cliente> clientes){
                for(int x=0;x<clientes.size();x++){
                    System.out.println(clientes.get(x).getNome());
                    System.out.println(clientes.get(x).getEndereco());
                    System.out.println(clientes.get(x).getLatitude());
                    System.out.println(clientes.get(x).getLong()+'\n');
                }
         }
        
        public static void imprimirFuncionarios(ArrayList<Funcionario> funcionarios){
            for(int i=0;i<funcionarios.size();i++){
                System.out.println(funcionarios.get(i).getNome() + "  Salário: " + funcionarios.get(i).getSalario() + "\n");
            }
        }
        
        public static void imprimirRotas(ArrayList<Rota> rotas ){
            int i,x;
            for(i=0;i<rotas.size();i++){
                System.out.println(rotas.get(i).getNome()+"\n");
                System.out.println("Funcionário: "+rotas.get(i).getEntregador().getNome()+ "  Salario:   " + rotas.get(i).getEntregador().getSalario()+"\n");
                System.out.println("Clientes: \n");
                
                for(x=0;x<rotas.get(i).getPontosEntrega().size();x++){
                    System.out.println(rotas.get(i).getPontosEntrega().get(x).getNome()+"\n");
                    System.out.println(rotas.get(i).getPontosEntrega().get(x).getEndereco()+"\n");
                    System.out.println(rotas.get(i).getPontosEntrega().get(x).getLatitude()+"\n");
                    System.out.println(rotas.get(i).getPontosEntrega().get(x).getLong()+"\n");
                }
            }
        }
        
        public static void imprimirArea(Area area){
            System.out.println("Área:\n" + area.getNome()+"\n");
            
            System.out.println("Colaborador: \n"+ "Nome: " + area.getColaborador().getNome() +"  Salário: "+ area.getColaborador().getSalario()+"\n");
            System.out.println("Rotas: \n");
            for(int i=0;i<area.getRotas().size();i++){
                System.out.println(area.getRotas().get(i).getNome()+"\n");
          }
        }
}
