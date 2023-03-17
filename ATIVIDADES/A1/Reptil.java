//package ATIVIDADES.A1;

public class Reptil extends Animal {

    protected double temperaturaCorporal;

    public Reptil(String nome, int idade, String especie, boolean alimentado, double temperaturaCorporal){
        super(nome, idade, especie, alimentado);
        this.temperaturaCorporal = temperaturaCorporal;
    }  

    @Override
    public void emitirSom(){
        System.out.println("~~som de réptil~~");
    }

    public void status(){
        System.out.println("RÉPTIL: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade + " anos");
        System.out.println("Espécie: " + this.especie);
        System.out.println("Alimentado: " + this.alimentado);
        System.out.println("Tempos de Gestação: " + this.temperaturaCorporal + " ºC");
    }
    
    public void alimentar(){
        this.alimentado = true;
    }
}
