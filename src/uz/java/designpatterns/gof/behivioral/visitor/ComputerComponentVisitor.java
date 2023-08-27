package uz.java.designpatterns.gof.behivioral.visitor;

// Visitor interface
interface ComputerComponentVisitor {
    void visit(CPU cpu);
    void visit(GPU gpu);
    void visit(Memory memory);
}