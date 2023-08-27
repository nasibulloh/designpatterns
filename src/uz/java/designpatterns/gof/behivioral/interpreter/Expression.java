package uz.java.designpatterns.gof.behivioral.interpreter;

// Abstract Expression
interface Expression {
    int interpret(Context context);
}