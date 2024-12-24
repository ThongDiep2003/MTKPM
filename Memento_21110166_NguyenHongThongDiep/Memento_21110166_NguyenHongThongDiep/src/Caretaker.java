import java.util.Stack;

public class Caretaker {
    private Stack<NoteMemento> mementos;

    public Caretaker() {
        this.mementos = new Stack<>();
    }

    public void addMemento(NoteMemento memento) {
        mementos.push(memento);
    }

    public NoteMemento undo() {
        if (mementos.isEmpty()) {
            return null;
        }
        return mementos.pop();
    }

    public NoteMemento redo() {
        if (mementos.isEmpty()) {
            return null;
        }
        return mementos.pop();
    }
}
