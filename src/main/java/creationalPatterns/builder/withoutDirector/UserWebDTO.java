package creationalPatterns.builder.withoutDirector;

/**
 * A product in builder pattern
 */
public class UserWebDTO implements UserDTO{

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
}
