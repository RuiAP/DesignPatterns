package structuralPatterns.facade;

public class Main {
    public static void main(String[] args) {


        //Code needed to Send an email without the facade ---> Notice the imports/dependency
//        Order order = new Order("101", 99.99);
//		Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
//		Stationary stationary = StationaryFactory.createStationary();
//		Email email = Email.getBuilder()
//					  .withTemplate(template)
//					  .withStationary(stationary)
//					  .forObject(order)
//					  .build();
//		Mailer mailer = Mailer.getMailer();
//		boolean result = mailer.send(email);




        Order order2 = new Order("101", 99.99);
        EmailFacade facade = new EmailFacade();
        boolean result2 = facade.sendOrderEmail(order2);

        System.out.println("Order Email "+ (result2?"sent!":"NOT sent..."));

    }
}
