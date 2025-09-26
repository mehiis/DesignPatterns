package Behavioral.Mediator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatMediator {
    private final Map<Integer, ChatController> controllers = new HashMap<>();

    public void registerController(ChatController controller){
        controllers.put(controller.id, controller);

        for (ChatController c : controllers.values()) {
            System.out.println(c);

            c.updateRecipients(List.copyOf(controllers.values()));
        }
    }

    public void sendMessage(Message message){
        System.out.println("Mediator: " + "Sending message to " + message.to + " from " + message.from + "...");
        controllers.get(message.to).receiveMessage(message);
    }

}
