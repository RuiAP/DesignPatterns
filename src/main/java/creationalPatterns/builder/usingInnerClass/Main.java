package creationalPatterns.builder.usingInnerClass;



public class Main {

    public static void main(String[] args) {

        //Even with the innerclass using a User and UserDTO is not a great example for this pattern



        UserDTOBuilder builder = UserWebDTO.getBuilder(); //UserWebDTOBuilder

        User user1 = fetchUser();
        UserDTO userDTO = builder
                .withFirstName(user1.getFirstName())
                .withLastName(user1.getLastName())
                .withAddress(user1.getAddress())
                .withBirthday(user1.getBirthday())
                .build();

        System.out.println(userDTO.getData());
    }


    public static User fetchUser(){
        Address address = new Address("rua do Carmo", 23);
        return new User("Joaquim", "Pereira","10/06/1962",address);
    }

}