import java.util.List;
import java.util.NoSuchElementException;

public class ChannelIterator implements Iterator<Channel> {
    private List<Channel> channels;
    private int position = 0;

    public ChannelIterator(List<Channel> channels) {
        this.channels = channels;
    }

    @Override
    public boolean hasNext() {
        return position < channels.size();
    }

    @Override
    public Channel next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        Channel channel = channels.get(position);
        position++;
        return channel;
    }
}