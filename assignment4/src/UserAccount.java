import java.util.ArrayList;
import java.util.List;

public class UserAccount implements Subject{
    //список подписчиков
    private List<Observer> followers = new ArrayList<>();
    private String userName;

    public UserAccount(String userName) {
        this.userName = userName;
    }

    @Override
    public void addObserver(Observer observer) {
        followers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        followers.remove(observer);
    }
    // цикл уведомляет всех своих подписчиков
    @Override
    public void notifyObservers(String message) {
        for (Observer follower : followers) {
            follower.update(userName + " выложил новый пост: " + message);
        }
    }

    // Метод для размещения нового поста
    public void publishPost(String postContent) {
        System.out.println(userName + " выложил новый пост: " + postContent);
        notifyObservers(postContent);
    }
}

