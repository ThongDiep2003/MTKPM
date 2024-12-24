
public class VisitorPatternExample {
    public static void main(String[] args) {

        Heading heading = new Heading("Proposal");
        Paragraph paragraph = new Paragraph("This is the final proposal", null);
        Image image = new Image("Information.jpg");


        ValidationVisitor validationVisitor = new ValidationVisitor();
        ReportVisitor reportVisitor = new ReportVisitor();

        heading.accept(validationVisitor);
        paragraph.accept(validationVisitor);
        image.accept(validationVisitor);

        heading.accept(reportVisitor);
        paragraph.accept(reportVisitor);
        image.accept(reportVisitor);
    }
}
