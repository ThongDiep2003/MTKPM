
public class Main {
	public static void main(String[] args) {
        // Create a FileManager with CsvFileStrategy
        FileManager fileManager = new FileManager(new CsvFileStrategy());

        // Read CSV file
        fileManager.readFile("data.csv");

        // Write CSV data
        fileManager.writeFile("data.csv", "This is some data");

        // Change FileStrategy to XmlFileStrategy
        fileManager.setFileStrategy(new XmlFileStrategy());

        // Read XML file
        fileManager.readFile("data.xml");

        // Write XML data
        fileManager.writeFile("data.xml", "<data>This is some data</data>");
    }
}
