package uz.java.designpatterns.gof.behivioral.momento;

// Client code
public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        History history = new History();

        textEditor.setContent("Hello, world!");
        history.push(textEditor.save());

        textEditor.setContent("This is a new content.");
        history.push(textEditor.save());

        textEditor.displayContent(); // Current content: This is a new content.

        textEditor.restore(history.pop());
        textEditor.displayContent(); // Current content: Hello, world!
    }
}