package uz.java.designpatterns.gof.behivioral.interpreter;

// Client code
public class Client {
    public static void main(String[] args) {
        Expression expression = new SubtractExpression(
            new AddExpression(new Number(10), new Number(5)),
            new Number(2)
        );

        Context context = new Context();
        int result = expression.interpret(context);

        System.out.println("Result: " + result); // Output: Result: 13
    }
}