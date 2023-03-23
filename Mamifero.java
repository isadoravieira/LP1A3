//package ATIVIDADES.A1;

public class Mamifero extends Animal{

    protected int tempoGestacao;

    public Mamifero(String nome, int idade, String especie, boolean alimentado, int tempoGestacao){
        super(nome, idade, especie, alimentado);
        this.tempoGestacao = tempoGestacao;
    }  

    @Override
    public void emitirSom(){
        System.out.println("~~som de mamífero~~");
    }

    
    public void alimentar(){
        this.alimentado = true;
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }

  
}
