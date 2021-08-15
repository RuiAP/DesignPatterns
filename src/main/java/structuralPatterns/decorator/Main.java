package structuralPatterns.decorator;

public class Main {
    public static void main(String[] args) {

        //Interessante de reparar que como usei classes abstractas com construtor, acabei por forçar o decorator a
        // receber um parâmetro no construtor que talvez não usem

        //Nota: Cuidado como lidas com os métodos hashCode() e equals(). Adaptar ao funcionamento que queres para ter
        //validações e interações com hashMaps, sets, etc corretas.

        Message newMessage = new TextMessage("Regular text message");
        Message messageToHtml = new HtmlEncodedMessage(newMessage, "i don't really use this message");
        Message messageToBase64 = new Base64EncodedMessage(messageToHtml, "i don't use this in base64 either...");

        System.out.println("Received: ["+newMessage.getContent()+"]");
        System.out.println("\n\n");


        System.out.println("Received: ["+messageToHtml.getContent()+"]");

        System.out.println("\n\n");
        System.out.println("Received: ["+messageToBase64.getContent()+"]");

    }
}
