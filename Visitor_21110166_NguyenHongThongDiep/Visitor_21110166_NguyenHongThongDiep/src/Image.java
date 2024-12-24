
public class Image extends DocumentElement {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitImage(this);
    }

	public String getUrl() {
		// TODO Auto-generated method stub
		return url;
	}
}
