
public class XmlFileStrategy implements FileStrategy{
	@Override
    public void read(String fileName) {
        // Implement XML file reading logic here
        System.out.println("Reading XML file: " + fileName);
    }

    @Override
    public void write(String fileName, String data) {
        // Implement XML file writing logic here
        System.out.println("Writing XML data to file: " + fileName);
    }
}
