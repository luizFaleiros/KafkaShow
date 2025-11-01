package br.com.kafkaShow.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class HomeController implements Initializable {
    @FXML
    private Button teste;

    @FXML
    private Label labelTeste;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        teste.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                testar();
            }
        });
    }

    private void testar(){
        labelTeste.setText("Testado e aprovado");
    }
}
