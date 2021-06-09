public class Main {
    public static void main(String[] args) {
        User user = new User("Son", 22);
        UserController userController = new UserController(new XMLStorage());
        userController.store(user);

        userController.setUserStorage(new MySQLStorage());
        userController.store(user);
    }
}
