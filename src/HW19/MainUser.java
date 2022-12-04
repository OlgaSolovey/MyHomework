package HW19;

public class MainUser {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        User userClone = (User) user.clone();
        userClone.age = 20;
        System.out.println(user.hashCode());
        System.out.println(userClone.hashCode());
        System.out.println(user.toString());
        System.out.println(userClone.toString());
        System.out.println(user.equals(userClone));
    }
}