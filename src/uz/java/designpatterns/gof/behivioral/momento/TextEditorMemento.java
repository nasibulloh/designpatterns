package uz.java.designpatterns.gof.behivioral.momento;

// Memento class
class TextEditorMemento {
    private final String content;

    public TextEditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}