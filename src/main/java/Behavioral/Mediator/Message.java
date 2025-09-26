package Behavioral.Mediator;

public class Message {
    public String message;
    public int from;
    public int to;

    public Message(String message, int from, int to) {
        this.message = message;
        this.from = from;
        this.to = to;
    }

    public String getMessage(){ return this.message;}
    public int getFrom(){ return this.from;}
    public int getTo(){ return this.to;}
}
