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

    public void status(){
        System.out.println("AVE: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade + " anos");
        System.out.println("Espécie: " + this.especie);
        System.out.println("Alimentado: " + this.alimentado);
        System.out.println("Tempos de Gestação: " + this.tipoBico);
    }

    public void alimentar(){
        this.alimentado = true;
    }
}
