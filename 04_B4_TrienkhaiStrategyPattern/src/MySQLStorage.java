public class MySQLStorage implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("Saving "+user.getName()+" to My SQL Storage");
    }
}
