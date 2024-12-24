
public class Main {
    public static void main(String[] args) {
        Note note = new Note("This is a new note.");
        Caretaker caretaker = new Caretaker();

        // ... your code for displaying current note content, editing, saving draft, etc. ...

        // Place the provided code snippet here
        System.out.println("Current note content: " + note.getContent());
        note.startEditing();
        note.setContent("This is an updated note.");
        caretaker.addMemento(note.createMemento());
        System.out.println("Note saved as draft.");

        // ... more editing or other functionalities ...

        note.setContent("This is a final note.");
        System.out.println("Current note content: " + note.getContent());
        note.restore(caretaker.undo());
        System.out.println("Restored note content: " + note.getContent());
    }
}