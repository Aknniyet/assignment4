import java.util.List;
public class Follower implements Observer {
    private String name;

    public Follower(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " получил уведомление: " + message);
    }
}
