package structuralPatterns.adapter;

public class CardDesigner {

    private Customer customer;

    public CardDesigner(Customer customer) {
        this.customer=customer;
    }

    public String design(){
        return "\t|  "+customer.getJobDescription()+"  |\n"
                +customer.getFullName() +"\n"+
                customer.getAddress()+"\n"+
                "----------------------------";
    }
}
