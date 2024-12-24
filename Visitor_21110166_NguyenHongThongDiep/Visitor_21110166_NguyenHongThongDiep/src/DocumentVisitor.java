
public interface DocumentVisitor {
    void visitHeading(Heading heading);
    void visitParagraph(Paragraph paragraph);
    void visitImage(Image image);
}
