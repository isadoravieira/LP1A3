import java.util.ArrayList;

public class Departamento <T> {
    
    ArrayList<T> funcionarios = new ArrayList<>();
    Arraylist<Gerente> gerentes = new ArrayList<>();

    public void adicionarFuncionarios(){
        funcionarios.add(T);
        gerentes.add(gerente);
    }

    public void listarFuncionarios(){
        System.out.println("\nLista de Funcionarios: ");
        for(Funcionario funcionario : funcionarios){
            System.out.println("Nome: " + funcionario.getNome() + "\nID: " + funcionario.getId() + "\nHorario de Entrada: " + funcionario.gethEntrada() + "\nHorario de Saida: " + funcionario.gethSaida());
        }
    }

    public void listarAtrasados(){
        for(Funcionario funcionario : funcionarios){
            if(funcionario.gethEntrada > 14.00){
                System.out.println(funcionario.getNome() + " -> Funcionario atrasado.\n");
            }
            else{
                System.out.println(funcionario.getNome() + "-> Funcionario no horário.\n");
            }
        }
    }
}

