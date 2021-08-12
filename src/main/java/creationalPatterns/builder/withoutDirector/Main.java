package creationalPatterns.builder.withoutDirector;


public class Main {

    public static void main(String[] args) {

        //This is not a great example because in this case it would make much more sense to
        // have a toDTO() method on the User class (Information Expert), instead of
        // using all these setters and getters. (even if you use an innerclass its still strange)
        // But its just for demonstration...
        User user1 = fetchUser();


        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO userDTO = builder.withFirstName(user1.getFirstName())
                .withLastName(user1.getLastName())
                .withAddress(user1.getAddress())
                .withBirthday(user1.getBirthday())
                .build();

        System.out.println(userDTO.getData());
    }


    public static User fetchUser(){

        Address address = new Address("rua de santana", 159);
        return new User("Rui", "Peixoto","13/06/1989",address);
    }

}