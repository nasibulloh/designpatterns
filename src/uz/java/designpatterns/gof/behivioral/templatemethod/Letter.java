package uz.java.designpatterns.gof.behivioral.templatemethod;

class Letter extends Document {
    @Override
    void createHeader() {
        System.out.println("Letter Header");
    }

    @Override
    void createContent() {
        System.out.println("Dear recipient,\nContent of the letter.");
    }

    @Override
    void createFooter() {
        System.out.println("Sincerely,\nYour Name");
    }
}