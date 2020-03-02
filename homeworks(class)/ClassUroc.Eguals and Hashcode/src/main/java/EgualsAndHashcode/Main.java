package EgualsAndHashcode;

public class Main {
    public static void main(String[] args) {
        User user = new User("name", "lastname");
        User user1 = new User("name", "lastname");
        System.out.println(user1.equals(user));
        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
    }
}
