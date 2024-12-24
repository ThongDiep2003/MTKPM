
public class Paragraph extends DocumentElement {
    private String content;
    private String text;

    public Paragraph(String content, String text) {
        this.content = content;
        this.text = text;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitParagraph(this);
    }

	public String getContent() {
		// TODO Auto-generated method stub
		return content;
	}
}