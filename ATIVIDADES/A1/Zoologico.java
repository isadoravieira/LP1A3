import java.util.ArrayList;
//import java.util.List;

public class Zoologico{

    ArrayList<Animal> animais = new ArrayList<Animal>();

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public void listarAnimais(){
        System.out.println("Lista de animais presesntes no zoológico: ");
        for(Animal animal : animais){
            System.out.println("Nome: " + animal.getNome() + "\nIdade: " + animal.getIdade() + " anos" + "\nEspecie: " + animal.getEspecie() + "\nFoi alimentado? " + animal.isAlimentado());
        }
    }

    /*public void adicionarAnimal(Animal animal){}
    public void listarAnimais(){}
    public void alimentarAnimais(){}*/

    
    
}