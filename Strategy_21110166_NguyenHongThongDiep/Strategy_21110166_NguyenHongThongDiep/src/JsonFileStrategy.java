
class JsonFileStrategy implements FileStrategy {

    @Override
    public void read(String fileName) {
        // Implement JSON file reading logic here
        System.out.println("Reading JSON file: " + fileName);
        // Parse JSON file content and extract relevant data
    }

    @Override
    public void write(String fileName, String data) {
        // Implement JSON file writing logic here
        System.out.println("Writing JSON data to file: " + fileName);
        // Convert data into JSON format and write it to the file
    }
}

