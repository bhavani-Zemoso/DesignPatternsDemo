package builderPattern;

public class BurgerBuilder {

    private Burger burger;

    public BurgerBuilder()
    {
        this.burger = new Burger();
    }

    public void setType(BurgerType type)
    {
        this.burger.setType(type);
    }

    public void addCheese()
    {
        this.burger.setCheese();
    }

    public void addLettuce()
    {
        this.burger.setLettuce();
    }

    public void addMayonnaise()
    {
        this.burger.setMayonnaise();
    }

    public void addTomato()
    {
        this.burger.setTomato();
    }

    public void addAlooPatty()
    {
        this.burger.setAlooPatty();
    }

    public void addChickenPatty()
    {
        this.burger.setChickenPatty();
    }

    public void addOnion()
    {
        this.burger.setOnion();
    }

    public void getBurger()
    {
        System.out.println("Serving " + burger.type + " Burger");
    }
}
