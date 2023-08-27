package uz.java.designpatterns.gof.behivioral.visitor;

class Memory implements ComputerComponent {
    @Override
    public void accept(ComputerComponentVisitor visitor) {
        visitor.visit(this);
    }
}