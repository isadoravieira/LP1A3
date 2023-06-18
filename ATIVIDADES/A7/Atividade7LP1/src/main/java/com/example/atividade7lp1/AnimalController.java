package com.example.atividade7lp1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;

public class AnimalController implements Initializable {
    @FXML
    private ComboBox<Object> comboBox;
    private List<Animal> animais = new ArrayList<>();

    @FXML
    private Button button;

    @FXML
    private TextArea txtArea;


    private ObservableList<Object> obsAnimal;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        listarAnimais();
    }

    public void listarAnimais(){

        Animal animal1 = new Animal(1, "Leão", 10);
        Animal animal2 = new Animal(2, "Elefante", 15);
        Animal animal3 = new Animal(3, "Girafa", 8);

        animais.add(animal1);
        animais.add(animal2);
        animais.add(animal3);

        obsAnimal = FXCollections.observableArrayList(animais);

        comboBox.setItems(obsAnimal);

    }

    public void selecionarAnimal(ActionEvent event){

        String nomeAnimalSelecionado = String.valueOf(comboBox.getValue());

        Animal animalSelecionado = null;
        for (Animal animal : animais) {
            if (animal.getNome().equals(nomeAnimalSelecionado)) {
                animalSelecionado = animal;
                break;
            }
        }

        if (animalSelecionado != null) {
            String informacoesAnimal = "ID: " + animalSelecionado.getId() + "\n";
            informacoesAnimal += "Nome: " + animalSelecionado.getNome() + "\n";
            informacoesAnimal += "Idade: " + animalSelecionado.getIdade();

            txtArea.setText(informacoesAnimal);
        }
    }


}
