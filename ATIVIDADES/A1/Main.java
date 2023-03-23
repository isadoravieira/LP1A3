
public class Main{

    public static void main(String [] args){
        
        Zoologico zoologico = new Zoologico();

        zoologico.animais.add(new Animal("Rogério", 2, "Ave", false));

        zoologico.listarAnimais();
    }
}