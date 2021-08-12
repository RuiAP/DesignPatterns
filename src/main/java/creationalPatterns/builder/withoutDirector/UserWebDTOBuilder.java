package creationalPatterns.builder.withoutDirector;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UserWebDTOBuilder implements UserDTOBuilder{

    private String fname;
    private String lname;
    private Address address;
    private LocalDate date;


    @Override
    public UserDTOBuilder withFirstName(String fname) {
       this.fname=fname;
       return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lname=lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        this.date = date;
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public UserDTO build() {
        String name = "";
        if(fname!=null && !fname.isEmpty()){
            name+=fname+" ";
        }
        if(lname!=null && !lname.isEmpty()){
            name+=lname;
        }

        String age =""+ Period.between(date, LocalDate.now()).getYears();
        return new UserWebDTO(name, address.toString(), age);
    }

    @Override
    public UserDTO getUserDTO() {
        return null;
    }
}
