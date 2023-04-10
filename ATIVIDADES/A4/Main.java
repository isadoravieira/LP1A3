public class Main {
    
    public static void main(String[] args) {
        
        Departamento departamento = new Departamento();

        departamento.add(new T("Rogerio", 1, 14, 20));

        departamento.listarFuncionarios();
        departamento.listarAtrasados();
    }

}
