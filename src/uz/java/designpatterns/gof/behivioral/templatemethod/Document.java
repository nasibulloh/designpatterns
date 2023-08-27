package uz.java.designpatterns.gof.behivioral.templatemethod;

abstract class Document {
    abstract void createHeader();
    abstract void createContent();
    abstract void createFooter();

    // Template method: defines the sequence of steps
    public final void createDocument() {
        createHeader();
        createContent();
        createFooter();
    }
}