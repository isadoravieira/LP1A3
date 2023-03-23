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

        
    public void alimentar(){
        this.alimentado = true;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    
}
