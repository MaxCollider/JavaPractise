/**
 * Интерфейс, который должен быть имплементирован классом-публикатором
 */
public interface Observable {
    public void subscribe(Observer o);
    public void unsubscribe(Observer o);
    public void notifySubs();
}
