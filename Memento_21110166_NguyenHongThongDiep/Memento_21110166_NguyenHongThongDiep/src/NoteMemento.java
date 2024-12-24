
public class NoteMemento {
    private final String content;
    private final boolean isEditing;

    public NoteMemento(String content, boolean isEditing) {
        this.content = content;
        this.isEditing = isEditing;
    }

    public String getContent() {
        return content;
    }

    public boolean isEditing() {
        return isEditing;
    }
}