
public class Heading extends DocumentElement {
    private String text;

    public Heading(String text) {
        this.text = text;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitHeading(this);
    }

	public String getText() {
		// TODO Auto-generated method stub
		return text;
	}
}
