package structuralPatterns.adapter;

public class Adapter implements Customer{

    private Employee employee;

    public Adapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getFullName() {
        return ""+employee.getFirstName()+" "+employee.getLastName();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }

    @Override
    public String getJobDescription() {
        return employee.jobTitle();
    }
}
