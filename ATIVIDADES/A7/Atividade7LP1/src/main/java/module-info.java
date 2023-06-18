module com.example.atividade7lp1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atividade7lp1 to javafx.fxml;
    exports com.example.atividade7lp1;
}