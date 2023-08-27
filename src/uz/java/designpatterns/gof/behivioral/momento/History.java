package uz.java.designpatterns.gof.behivioral.momento;

import java.util.Stack;

// Caretaker
class History {
    private final Stack<TextEditorMemento> mementos = new Stack<>();

    public void push(TextEditorMemento memento) {
        mementos.push(memento);
    }

    public TextEditorMemento pop() {
        return mementos.pop();
    }
}
