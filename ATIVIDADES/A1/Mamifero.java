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

        
    public void status(){
        System.out.println("MAMÍFERO: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade + " anos");
        System.out.println("Espécie: " + this.especie);
        System.out.println("Alimentado: " + this.alimentado);
        System.out.println("Tempos de Gestação: " + this.tempoGestacao + " dias");
    }

    public void alimentar(){
        this.alimentado = true;
    }
}
