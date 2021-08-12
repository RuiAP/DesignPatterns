package creationalPatterns.builder.usingInnerClass;


public class Address {
    private String street;
    private int streetNumber;

    public Address(String street, int streetNumber) {
        this.street=street;
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address: "+street+" "+streetNumber;
    }
}
