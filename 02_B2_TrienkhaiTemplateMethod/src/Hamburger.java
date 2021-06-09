public class Hamburger extends Meal{
    @Override
    public void prepareIngredients() {
        System.out.println("Getting burger, buns, and french fries");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burger on grill and fries in oven");
    }

    @Override
    public void cleanUp() {
        System.out.println("Throwing away paper plates");
    }
}
