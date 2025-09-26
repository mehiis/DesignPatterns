package Behavioral.Mediator;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class ChatClient {
    private final ChatController controller;
    private final int id;
    private int recipientId;

    //GUI ELEMENTS
    private ChoiceBox choiceBox;
    private Button sendButton;
    private TextField chatField;
    private ListView<String> chatBox;

    public ChatClient(int id, ChatMediator mediator){
        this.controller = new ChatController(this, mediator, id);
        this.id = id;
        System.out.println("Client #" + id + " created");

        openWindow(this.id);
    }

    public void openWindow(int id){
        Stage stage = new Stage();
        stage.setTitle("ChatBox " + (id + 1));
        stage.setScene(createWindow(id));
        stage.show();
    }

    public Scene createWindow(int id){
        VBox root = new VBox();
        Label label = new Label("ChatBox #" + (id + 1));
        label.setStyle("-fx-font-weight: bold; -fx-font-size: 24px;");

        chatBox = new ListView<>();
        chatBox.editableProperty().setValue(false);

        HBox chatBoxContainer = new HBox();

        choiceBox = new ChoiceBox();
        choiceBox.setOnAction(e -> {
                    toggleSendButton();
                    setRecipientId(Integer.parseInt(choiceBox.getSelectionModel().getSelectedItem().toString()) - 1);
                }
        );

        chatField = new TextField();
        sendButton = new Button("Send");
        sendButton.setDisable(true);

        chatBoxContainer.getChildren().addAll(choiceBox, chatField, sendButton);

        sendButton.setOnAction(e -> {
            Message message = new Message(chatField.getText(), id, recipientId);
            sendMessage(message);
        });
        chatField.setStyle("-fx-font-size: 18px; -fx-start-margin-top: 10");

        root.getChildren().addAll(label, chatBox, chatBoxContainer);

        controller.registerController();
        return new Scene(root, 400, 400);
    }

    public void updateRecipients(List<ChatController> recipients){
        choiceBox.getItems().clear();

        for (ChatController c : recipients){
            if(id != c.id){
                choiceBox.getItems().add((c.id + 1));
            }
        }
    }

    public void toggleSendButton(){
        sendButton.setDisable(choiceBox.getSelectionModel().isEmpty());
    }

    private void setRecipientId(int id){
        recipientId = id;
    }

    private void sendMessage(Message message){
        System.out.println("Client #" + (message.from + 1) + " sent message: " + message + " to Client #" + (message.to + 1));
        chatBox.getItems().add("TO Client #" + (message.to + 1) + ": " + message.message);

        controller.sendMessage(message);
        chatField.clear();
    }

    public void receiveMessage(Message message){
        System.out.println("Client #" + (message.to + 1) + " received message: " + message.message);

        chatBox.getItems().add("FROM Client #" + (message.from + 1) + ": " + message.message);
    }
}
