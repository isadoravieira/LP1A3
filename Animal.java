//package ATIVIDADES.A1;

public class Animal{
    protected String nome;
    protected int idade;
    protected String especie;
    protected boolean alimentado;

    public Animal(String nome, int idade, String especie, boolean alimentado){
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.alimentado = alimentado;
    }

    public void emitirSom(){
        System.out.println("O animal faz barulho");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isAlimentado() {
        return alimentado;
    }

    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }
    
    
    
}

    