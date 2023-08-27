package uz.java.designpatterns.gof.creational.prototype;

class Client {
    public static void main(String[] args) {
        OrderService service = new OrderService(1000, 1010);
        try {
            OrderService copy = service.clone();
            System.out.println(copy.equals(service));
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
