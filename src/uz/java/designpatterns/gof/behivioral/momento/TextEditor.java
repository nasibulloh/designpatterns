package uz.java.designpatterns.gof.behivioral.momento;

// Originator (Text Editor)
class TextEditor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public TextEditorMemento save() {
        return new TextEditorMemento(content);
    }

    public void restore(TextEditorMemento memento) {
        content = memento.getContent();
    }

    public void displayContent() {
        System.out.println("Current content: " + content);
    }
}