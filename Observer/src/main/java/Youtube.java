import java.util.ArrayList;
import java.util.List;

/**
 * Класс-публикатор
 * Класс, который после каждого сделанного изменнения уведомляет об этом своих подписчиков
 */

public class Youtube implements Observable{
    private List<Observer> listOfSubs;
    private String newVideo;

    public Youtube() {
        listOfSubs = new ArrayList<>();
    }

    /**
     * Медод, который публикует новое видео, и уведомляет подписчиков об этом
     * @param newVideo - название нового видео
     */
    public void publishNewVideo(String newVideo) {
        this.newVideo = newVideo;
        notifySubs();
    }

    @Override
    public void subscribe(Observer o) {
        listOfSubs.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        listOfSubs.remove(o);
    }

    /**
     * Метод, который уведомляет подписчиков о сделанном изменении
     */
    @Override
    public void notifySubs() {
        for (Observer listeners: listOfSubs) {
            listeners.update(newVideo);
        }
    }
}
