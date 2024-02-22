package patterns.behavioral.pubsub.task.pubsub;

import java.util.ArrayList;
import java.util.List;

/**
  Description object of video channel(model).
 */
public class VideoChannel implements Publisher{
    private final List<Listener> subscribers;
    private final List<Video> videos;
    private ChannelAdmin admin;

    public VideoChannel() {
        this(new ChannelAdmin("Rob"));
    }

    public VideoChannel(ChannelAdmin admin) {
        this.subscribers = new ArrayList<>();
        this.videos = new ArrayList<>();
        this.admin = admin;
    }

    public void addVideo(Video video) {
        videos.add(video);
        notifySubscribers(video, ("Video is released on chanel " + video.getName()));
    }

    public ChannelAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(ChannelAdmin admin) {
        this.admin = admin;
    }

    @Override
    public void notifySubscribers(Video video, String message) {
        for (Listener sub : subscribers) {
            sub.process(video);
        }
    }

    @Override
    public void addSubscriber(Listener listener) {
        subscribers.add(listener);
    }

    @Override
    public void deleteSubscriber(Listener listener) {
        subscribers.remove(listener);
    }
}
