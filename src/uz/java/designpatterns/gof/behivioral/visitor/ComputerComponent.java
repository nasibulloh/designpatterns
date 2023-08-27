package uz.java.designpatterns.gof.behivioral.visitor;

// Element interface
interface ComputerComponent {
    void accept(ComputerComponentVisitor visitor);
}

