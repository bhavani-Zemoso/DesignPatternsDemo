package builderPattern;

public class Director {

    private BurgerBuilder builder;

    public Director(BurgerBuilder builder)
    {
        this.builder = builder;
    }

    public void serveCheeseBurger()
    {
        builder.setType(BurgerType.CHEESE);
        builder.addCheese();
        builder.addTomato();
        builder.addMayonnaise();
    }

    public void serveVeggieBurger()
    {
        builder.setType(BurgerType.VEGGIE);
        builder.addTomato();
        builder.addOnion();
        builder.addLettuce();
        builder.addCheese();
        builder.addMayonnaise();
        builder.getBurger();
    }

    public void serveChickenBurger()
    {
        builder.setType(BurgerType.CHICKEN);
        builder.addChickenPatty();
        builder.addMayonnaise();
        builder.addCheese();
    }

    public void serveAlooPattyBurger()
    {
        builder.setType(BurgerType.ALOOPATTY);
        builder.addAlooPatty();
        builder.addOnion();
        builder.addCheese();
        builder.addLettuce();
        builder.addTomato();
    }
}
