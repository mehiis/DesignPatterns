package org.example.Behavioral.ChainOfResponsibility.Handlers;

import org.example.Behavioral.ChainOfResponsibility.Message;
import org.example.Behavioral.ChainOfResponsibility.MessageType;

public class CompensationHandler extends MessageHandler {
    @Override
    public void processMessage(Message message) {
        if(message.getType() == MessageType.COMPENSATION_CLAIM){
            System.out.println("## Compensation claim ###\n" +
                    "Sender: " + message.getSender() + "\n"
                    + "Message: " + message.getMessage() + "\n\n" +
                    "Compensation handler forwarded message to contact center and after sales team to be resolved.\n\n--------------------------------------------------------------------------");
        } else {
            System.out.println("Compensation handler could not process incoming message of type: " + message.getType() + ".\n\n--------------------------------------------------------------------------");
            super.processMessage(message);
        }
    }
}
