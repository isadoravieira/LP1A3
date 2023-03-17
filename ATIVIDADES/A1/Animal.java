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
    
    
}

    