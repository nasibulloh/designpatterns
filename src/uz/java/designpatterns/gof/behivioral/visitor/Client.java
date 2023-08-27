package uz.java.designpatterns.gof.behivioral.visitor;

// Client code
public class Client {
    public static void main(String[] args) {
        ComputerComponent cpu = new CPU();
        ComputerComponent gpu = new GPU();
        ComputerComponent memory = new Memory();

        ComputerComponentVisitor monitorVisitor = new MonitorVisitor();

        cpu.accept(monitorVisitor);
        gpu.accept(monitorVisitor);
        memory.accept(monitorVisitor);
    }
}