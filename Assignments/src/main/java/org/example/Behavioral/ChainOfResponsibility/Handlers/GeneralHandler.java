package org.example.Behavioral.ChainOfResponsibility.Handlers;

import org.example.Behavioral.ChainOfResponsibility.Message;
import org.example.Behavioral.ChainOfResponsibility.MessageType;

public class GeneralHandler extends MessageHandler{

    @Override
    public void processMessage(Message message) {
        if(message.getType() == MessageType.GENERAL_FEEDBACK){
            System.out.println("### General feedback ###\n" +
                    "Sender: " + message.getSender() + "\n"
                    + "Message: " + message.getMessage() + "\n\n" +
                    "General handler resolved message.\n\n--------------------------------------------------------------------------");
        } else {
            System.out.println("General handler could not process incoming message of type: " + message.getType() + ".\n\n--------------------------------------------------------------------------");
            super.processMessage(message);
        }
    }
}
