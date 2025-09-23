package Behavioral.ChainOfResponsibility;

import Behavioral.ChainOfResponsibility.Handlers.*;

public class Main {
    public static void main(String[] args) {
        Message compensationMessage = new Message(MessageType.COMPENSATION_CLAIM, "aku.ankka@linna.ee", "I want my money back!!");
        Message contactReqMessage = new Message(MessageType.CONTACT_REQUEST, "peku@jabaduu.es", "Please I want job, very poor but great working ethics!");
        Message developmentMessage = new Message(MessageType.DEVELOPMENT_SUGGESTION, "stackeholders@messagecomp.ru", "Please learn to code, this product very stinky.");
        Message generalMessage = new Message(MessageType.GENERAL_FEEDBACK, "john.doe@linna.ee", "Hello it's me!");

        MessageHandler primaryMessageHandler;

        MessageHandler generalHandler = new GeneralHandler();
        MessageHandler contactHandler = new ContactHandler();
        MessageHandler compenstaionHandler = new CompensationHandler();
        MessageHandler developmentHandler = new DevelopmentHandler();

        generalHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(compenstaionHandler);
        compenstaionHandler.setNextHandler(developmentHandler);
        primaryMessageHandler = generalHandler;

        primaryMessageHandler.processMessage(compensationMessage);
        primaryMessageHandler.processMessage(contactReqMessage);
        primaryMessageHandler.processMessage(generalMessage);
        primaryMessageHandler.processMessage(developmentMessage);
    }

}
