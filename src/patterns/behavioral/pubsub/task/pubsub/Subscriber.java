package patterns.behavioral.pubsub.task.pubsub;

import java.util.ArrayList;
import java.util.List;

/**
  Video channel's subscriber.
 */
public class Subscriber implements Listener{
    private final String nickname;
    private boolean isLikeVideo;
    private final List<?> channelAdministrators;

    public Subscriber(String nickname) {
        this.nickname = nickname;
        this.isLikeVideo = false;
        this.channelAdministrators = new ArrayList<>();
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isLikeVideo() {
        return isLikeVideo;
    }

    public void setLikeVideo(boolean likeVideo) {
        isLikeVideo = likeVideo;
    }

    @Override
    public void process(Video video) {
        if (video.getDuration() > 10) {
            isLikeVideo = false;
            System.out.println(this.nickname + " dis " + video.getName());
        }
        else {
            isLikeVideo = true;
            System.out.println(this.nickname + " like " + video.getName());
        }

    }
}
