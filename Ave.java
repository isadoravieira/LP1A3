//package ATIVIDADES.A1;

public class Ave extends Animal {

    protected String tipoBico;

    public Ave(String nome, int idade, String especie, boolean alimentado, String tipoBico){
        super(nome, idade, especie, alimentado);
        this.tipoBico = tipoBico;
    }  

    @Override
    public void emitirSom(){
        System.out.println("~~som de ave~~");
    }

    public void alimentar(){
        this.alimentado = true;
    }

    public String getTipoBico() {
        return tipoBico;
    }

    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }

    
}
