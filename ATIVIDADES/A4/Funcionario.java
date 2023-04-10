public class Funcionario extends Obsject{

    private String nome;
    private int id;
    private double hEntrada;
    private double hSaida;

    public Funcionario(String nome, int id, double hEntrada, double hSaida) {
        this.nome = nome;
        this.id = id;
        this.hEntrada = hEntrada;
        this.hSaida = hSaida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double gethEntrada() {
        return hEntrada;
    }

    public void sethEntrada(double hEntrada) {
        this.hEntrada = hEntrada;
    }

    public double gethSaida() {
        return hSaida;
    }

    public void sethSaida(double hSaida) {
        this.hSaida = hSaida;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funcionario other = (Funcionario) obj;
        if (id != other.id)
            return false;
        return true;
    } 


    /*public boolean equals(Object obj){
        for(Funcionario funcionario : funcionarios){
            if(funcionarios.getId.equals()){
                System.out.println("Os IDs são iguais");
            }
            else{
                System.out.println("Os IDs são diferentes");
            }
        }
    }*/
   
    
}