import java.util.ArrayList;
import java.util.List;

public class ChannelCollection {
    private List<Channel> channels;

    public ChannelCollection() {
        this.channels = new ArrayList<>();
    }

    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    public Iterator<Channel> createIterator() {
        return new ChannelIterator(channels);
    }
}
