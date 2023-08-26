package uz.java.designpatterns.gof.creational.builder;

public class PetShop {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }
    public static class PersonBuilder {
        private PetShop petShop = new PetShop();

        public PersonBuilder id(int id) {
            petShop.id = id;
            return this;
        }

        public PersonBuilder name(String name) {
            petShop.name = name;
            return this;
        }

        public PetShop build() {
            return petShop;
        }
    }
}
