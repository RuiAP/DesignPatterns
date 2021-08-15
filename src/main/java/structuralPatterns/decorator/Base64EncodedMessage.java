package structuralPatterns.decorator;

public class Base64EncodedMessage extends Decorator{

    public Base64EncodedMessage(Message messageObject, String message) {
        super(messageObject, message);
    }

    @Override
    public String getContent() {
        String originalMessage = this.messageObject.getContent();
        System.out.println("Encoded message with Base64 encoding...");
        return "Encoded the message in Base64 --> "+"\""+originalMessage+"\"";
    }
}
