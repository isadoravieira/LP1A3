public class Analista extends Funcionario implements Ponto{

    public Analista(String nome, int id, double hEntrada, double hSaida) {
        super(nome, id, hEntrada, hSaida);
    }
    
    @Override
    public double horaEntrada(Funcionario funcionario){
        return funcionario.gethEntrada;
    }

    @Override
    public double horaSaida(Funcionario funcionario){
        return funcionario.gethSaida;
    }

}
