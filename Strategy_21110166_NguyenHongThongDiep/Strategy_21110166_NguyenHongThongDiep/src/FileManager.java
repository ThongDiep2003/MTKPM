
public class FileManager {
	private FileStrategy fileStrategy;

    public FileManager(FileStrategy fileStrategy) {
        this.fileStrategy = fileStrategy;
    }

    public void readFile(String fileName) {
        fileStrategy.read(fileName);
    }

    public void writeFile(String fileName, String data) {
        fileStrategy.write(fileName, data);
    }

    public void setFileStrategy(FileStrategy fileStrategy) {
        this.fileStrategy = fileStrategy;
    }
}
