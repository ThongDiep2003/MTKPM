
public class CsvFileStrategy implements FileStrategy{
	@Override
    public void read(String fileName) {
        // Implement CSV file reading logic here
        System.out.println("Reading CSV file: " + fileName);
    }

    @Override
    public void write(String fileName, String data) {
        // Implement CSV file writing logic here
        System.out.println("Writing CSV data to file: " + fileName);
    }
}
