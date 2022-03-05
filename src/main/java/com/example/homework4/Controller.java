package com.example.homework4;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private ListView<String> friendsList;

    @FXML
    private MenuBar menuBar;

    @FXML
    private TextField messageField;

    @FXML
    private ListView<String> messageList;

    @FXML
    private Button sendBtn;

    @FXML
    private void exitApp() {
        System.exit(0);
    }

    @FXML
    private void clearMessageList() {
        messageList.getItems().clear();
    }

    @FXML
    private void appInfo() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Информация о приложении");
        alert.setHeaderText("Внимание! Данное приложение является демо версией клиента для пользователя.");
        alert.setContentText("Интерфейс и функционал не является конечными и будут дорабатываться.");
        alert.show();
    }

    @FXML
    void initialize() {

        friendsList.getItems().add("Андрей Васильев");
        friendsList.getItems().add("Тимофей Сафронов");
        friendsList.getItems().add("Игорь Честнов");
        friendsList.getItems().add("Иван Иванов");

        sendBtn.setOnAction(event -> {
            String message = messageField.getText().trim();
            messageList.getItems().add(String.format("User: %s", message));
            messageField.setText("");
        });


    }

}
