package uz.java.designpatterns.gof.behivioral.templatemethod;

public class Client {
    public static void main(String[] args) {
        Document report = new Report();
        Document letter = new Letter();

        System.out.println("Creating a report:");
        report.createDocument();

        System.out.println("\nCreating a letter:");
        letter.createDocument();
    }
}
