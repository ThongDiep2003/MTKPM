
public class ValidationVisitor implements DocumentVisitor {
    @Override
    public void visitHeading(Heading heading) {
        // Kiểm tra tính hợp lệ của tiêu đề
        if (heading.getText() == null || heading.getText().isEmpty()) {
            System.out.println("Error: Invalid heading");
        } else {
            System.out.println("Heading is valid: " + heading.getText());
        }
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        // Kiểm tra tính hợp lệ của đoạn văn
        if (paragraph.getContent() == null || paragraph.getContent().isEmpty()) {
            System.out.println("Error: Invalid paragraph");
        } else {
            System.out.println("Paragraph is valid: " + paragraph.getContent());
        }
    }

    @Override
    public void visitImage(Image image) {
        // Kiểm tra tính hợp lệ của hình ảnh
        if (image.getUrl() == null || image.getUrl().isEmpty()) {
            System.out.println("Error: Invalid image URL");
        } else {
            System.out.println("Image is valid: " + image.getUrl());
        }
    }
}

