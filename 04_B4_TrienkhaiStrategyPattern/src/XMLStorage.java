public class XMLStorage implements UserStorage{
    @Override
    public void store(User user) {
        System.out.println("Saving "+user.getName()+" to XML Storage");
    }
}
