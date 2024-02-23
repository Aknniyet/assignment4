public class Main {
    public static void main(String[] args) {
        UserAccount user1 = new UserAccount("User1");
        UserAccount user2 = new UserAccount ("User2");

        Follower follower1 = new Follower("Follower1");
        Follower follower2 = new Follower("Follower2");

        user1.addObserver(follower1);
        user1.addObserver(follower2);

        user1.publishPost("Это мой первый пост!");

        System.out.println("====================");

        user2.addObserver(follower2);
        user2.publishPost("Всем привет!");

        System.out.println("====================");

        user1.removeObserver(follower2);
        user1.publishPost("Еще один пост!");

    }
}
