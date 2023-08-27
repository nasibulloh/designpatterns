package uz.java.designpatterns.gof.behivioral.visitor;

class GPU implements ComputerComponent {
    @Override
    public void accept(ComputerComponentVisitor visitor) {
        visitor.visit(this);
    }
}