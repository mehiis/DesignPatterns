package Behavioral.ChainOfResponsibility.Handlers;

import Behavioral.ChainOfResponsibility.Message;
import Behavioral.ChainOfResponsibility.MessageType;

public class ContactHandler extends MessageHandler{
    @Override
    public void processMessage(Message message) {
        if(message.getType() == MessageType.CONTACT_REQUEST){
            System.out.println("## Contact request ###\n" +
                    "Sender: " + message.getSender() + "\n"
                    + "Message: " + message.getMessage() + "\n\n" +
                    "Contact handler received message and is planning on contact the sender within 2-3 business days.\n\n--------------------------------------------------------------------------");
        } else {
            System.out.println("Contact handler could not process incoming message of type: " + message.getType() + ".\n\n--------------------------------------------------------------------------");
            super.processMessage(message);
        }
    }
}
