package modelo;

public class Pessoa {
    String nome;
    float nivelFome;
    
    public Pessoa(String nome,float nivelFome){
        this.nome=nome;
        this.nivelFome=nivelFome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    ///

    public float getNivelFome() {
        return nivelFome;
    }

    public void setNivelFome(float nivelFome) {
        this.nivelFome = nivelFome;
    }
}
