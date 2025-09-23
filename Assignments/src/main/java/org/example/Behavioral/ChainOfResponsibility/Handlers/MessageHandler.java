package org.example.Behavioral.ChainOfResponsibility.Handlers;
import org.example.Behavioral.ChainOfResponsibility.Message;

public abstract class MessageHandler {
    private MessageHandler nextHandler;

    public void processMessage(Message message) {
        if(nextHandler != null) {
            nextHandler.processMessage(message);
        }
    }

    public void setNextHandler(MessageHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
