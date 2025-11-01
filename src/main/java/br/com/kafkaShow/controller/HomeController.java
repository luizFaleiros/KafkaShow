package br.com.kafkaShow.controller;

import br.com.kafkaShow.entities.KafkaTopics;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class HomeController implements Initializable {
    @FXML
    private Button addNewTopic;

    @FXML
    private ListView<KafkaTopics> kafkaTopicsList;

    @FXML
    private ListView<String> messageBrokerList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> items = FXCollections.observableArrayList(
                "Item 1", "Item 2", "Item 3", "Item 4", "Item 5"
        );

        addNewTopic.setOnAction(event -> messageBrokerList.setItems(items));
    }

}
