package Behavioral.ChainOfResponsibility.Handlers;
import Behavioral.ChainOfResponsibility.Message;

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
