package uz.java.designpatterns.gof.creational.builder;

class Client {
    public static void main(String[] args) {
        PetShop petShop = PetShop.builder()
                .name("John")
                .id(1)
                .build();

        System.out.println(petShop);
    }
}
