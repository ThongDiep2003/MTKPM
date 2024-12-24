
public class Note {
    private String content;
    private boolean isEditing;

    public Note(String content) {
        this.content = content;
        this.isEditing = false;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isEditing() {
        return isEditing;
    }

    public void startEditing() {
        this.isEditing = true;
    }

    public void stopEditing() {
        this.isEditing = false;
    }

    public NoteMemento createMemento() {
        return new NoteMemento(content, isEditing);
    }

    public void restore(NoteMemento memento) {
        this.content = memento.getContent();
        this.isEditing = memento.isEditing();
    }
}