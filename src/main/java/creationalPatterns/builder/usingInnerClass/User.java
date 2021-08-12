package creationalPatterns.builder.usingInnerClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Entity class used to construct the DTO
 */
public class User {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;

    public User(String firstName, String lastName, String birthday, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd/MM/yyy"));;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Address getAddress() {
        return address;
    }

}
