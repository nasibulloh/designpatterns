package uz.java.designpatterns.gof.behivioral.templatemethod;

class Report extends Document {
    @Override
    void createHeader() {
        System.out.println("Report Header");
    }

    @Override
    void createContent() {
        System.out.println("Report Content");
    }

    @Override
    void createFooter() {
        System.out.println("Report Footer");
    }
}
