package creationalPatterns.builder.usingInnerClass;

import java.time.LocalDate;
import java.time.Period;

/**
 * A product in builder pattern
 */
public class UserWebDTO implements UserDTO {

    private String name;
    private String address;
    private String age;


    public UserWebDTO(String name, String address, String age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }


    @Override
    public String getData() {
        return ""+name +" - " + age+" - "+address;
    }


    public static UserDTOBuilder getBuilder(){
        return new UserWebDTOBuilder();
    }

    private static class UserWebDTOBuilder implements UserDTOBuilder {

        private String fname;
        private String lname;
        private Address address;
        private LocalDate date;
        private UserDTO dto;


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
            this.dto = new UserWebDTO(name, address.toString(), age);
            return this.dto;
        }

        @Override
        public UserDTO getUserDTO() {
            return this.dto;
        }
    }


}
