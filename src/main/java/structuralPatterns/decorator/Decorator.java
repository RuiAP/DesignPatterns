package structuralPatterns.decorator;

public abstract class Decorator extends Message{

    protected Message messageObject;

    public Decorator(Message messageObject, String message) {
        super(message);
        this.messageObject = messageObject;
    }

}
