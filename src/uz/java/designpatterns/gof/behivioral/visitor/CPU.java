package uz.java.designpatterns.gof.behivioral.visitor;

class CPU implements ComputerComponent {
    @Override
    public void accept(ComputerComponentVisitor visitor) {
        visitor.visit(this);
    }
}
