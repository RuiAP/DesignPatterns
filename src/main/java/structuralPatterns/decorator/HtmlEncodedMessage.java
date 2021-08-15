package structuralPatterns.decorator;

public class HtmlEncodedMessage extends Decorator{

    //nao confundir o String message do Component com o Message message do Decorator
    public HtmlEncodedMessage(Message messageObject, String message) {
        super(messageObject, message);
    }

    @Override
    public String getContent() {
        String originalMessage = this.messageObject.getContent();
        System.out.println("Adapted Message to HTML...");
        return "Adapted the message to HTML: "+originalMessage;
    }
}
