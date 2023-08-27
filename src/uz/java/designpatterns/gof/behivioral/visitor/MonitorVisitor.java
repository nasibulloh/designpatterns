package uz.java.designpatterns.gof.behivioral.visitor;

// Concrete Visitors (Different operations)
class MonitorVisitor implements ComputerComponentVisitor {
    @Override
    public void visit(CPU cpu) {
        System.out.println("Monitor: Displaying CPU information.");
    }

    @Override
    public void visit(GPU gpu) {
        System.out.println("Monitor: Displaying GPU information.");
    }

    @Override
    public void visit(Memory memory) {
        System.out.println("Monitor: Displaying memory information.");
    }
}