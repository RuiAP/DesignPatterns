package structuralPatterns.adapter;

public class Employee {

    private String firstName;
    private String lastName;
    private String officeLocation;
    private String jobTitle;

    public Employee() {
        this.firstName="John";
        this.lastName="Doe";
        this.officeLocation="Liberty avenue, 1234 - NYC";
        this.jobTitle="Business Manager";
    }

    public Employee(String firstName, String lastName, String officeLocation, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeLocation = officeLocation;
        this.jobTitle = jobTitle;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getOfficeLocation(){
        return this.officeLocation;
    }

    public String jobTitle(){
        return this.jobTitle;
    }

}
