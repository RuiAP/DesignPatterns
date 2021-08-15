package structuralPatterns.decorator;

public class TextMessage extends Message{


    public TextMessage(String message) {
        super(message);
    }

    @Override
    public String getContent() {
        System.out.println("Text message sent...");
        return this.message;
    }
}
