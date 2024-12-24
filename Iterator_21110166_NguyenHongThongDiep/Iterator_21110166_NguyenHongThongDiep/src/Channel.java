
public class Channel {
    private String name;
    private ChannelGenre genre;

    public Channel(String name, ChannelGenre genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public ChannelGenre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                '}';
    }
}

