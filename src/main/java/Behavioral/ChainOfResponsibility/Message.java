package Behavioral.ChainOfResponsibility;

public class Message {
    public MessageType messageType;
    public String senderEmail;
    public String message;

    public Message(MessageType messageType, String senderEmail, String message) {
        this.messageType = messageType;
        this.senderEmail = senderEmail;
        this.message = message;
    }

    public MessageType getType(){
        return this.messageType;
    }
    public String getSender(){
        return this.senderEmail;
    }
    public String getMessage(){ return this.message;}
}
