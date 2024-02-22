package patterns.behavioral.pubsub.task.pubsub;

public interface Publisher {
    void notifySubscribers(Video video, String message);
    void addSubscriber(Listener listener);
    void deleteSubscriber(Listener listener);
}
