
public class Main {
    public static void main(String[] args) {
        ChannelCollection channelCollection = new ChannelCollection();
        channelCollection.addChannel(new Channel("BBC News", ChannelGenre.NEWS));
        channelCollection.addChannel(new Channel("ESPN", ChannelGenre.SPORTS));
        channelCollection.addChannel(new Channel("Netflix", ChannelGenre.MOVIES));
        channelCollection.addChannel(new Channel("Disney Channel", ChannelGenre.KIDS));

        Iterator<Channel> iterator = channelCollection.createIterator();
        while (iterator.hasNext()) {
            Channel channel = iterator.next();
            System.out.println(channel);
        }
    }
}
