package Behavioral.Mediator;

import java.util.List;

public class ChatController {
    public int id;
    private final ChatClient view;
    private final ChatMediator mediator;

    public ChatController(ChatClient view, ChatMediator mediator, int id){
        this.id = id;
        this.view = view;
        this.mediator = mediator;
    }

    @Override
    public String toString() {
        return "Controller #" + id;
    }

    public void registerController(){
        mediator.registerController(this);
    }

    public void updateRecipients(List<ChatController> recipients){
        view.updateRecipients(recipients);
    }

    public void sendMessage(Message message){
        mediator.sendMessage(message);
    }

    public void receiveMessage(Message message){
        view.receiveMessage(message);
    }
}
