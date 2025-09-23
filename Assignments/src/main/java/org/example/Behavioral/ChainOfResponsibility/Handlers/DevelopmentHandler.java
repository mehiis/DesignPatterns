package org.example.Behavioral.ChainOfResponsibility.Handlers;

import org.example.Behavioral.ChainOfResponsibility.Message;
import org.example.Behavioral.ChainOfResponsibility.MessageType;

public class DevelopmentHandler extends MessageHandler{
    @Override
    public void processMessage(Message message) {
        if(message.getType() == MessageType.DEVELOPMENT_SUGGESTION){
            System.out.println("## Development suggestion ###\n" +
                    "Sender: " + message.getSender() + "\n"
                    + "Message: " + message.getMessage() + "\n\n" +
                    "Development handler forwarded message to development team.\n\n--------------------------------------------------------------------------");
        } else {
            System.out.println("Development handler could not process incoming message of type: " + message.getType() + ".\n\n--------------------------------------------------------------------------");
            super.processMessage(message);
        }
    }
}
