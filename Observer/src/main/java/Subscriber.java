/**
 * Класс-подписчик
 */
public class Subscriber implements Observer{
    String nickname;

    public Subscriber(String nickname, Observable o) {
        this.nickname = nickname;
        o.subscribe(this);
    }

    @Override
    public void update(String news) {
        System.out.println("Подписчику " + nickname + " пришло новое видео: " + news);
    }
}
