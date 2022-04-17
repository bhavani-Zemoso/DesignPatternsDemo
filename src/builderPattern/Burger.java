package builderPattern;

public class Burger {
    public BurgerType type = BurgerType.CHEESE;
    public boolean cheese = false;
    public boolean alooPatty = false;
    public boolean lettuce = false;
    public boolean onion = false;
    public boolean chickenPatty = false;
    public boolean tomato = false;
    public boolean mayonnaise = false;

    public void setCheese() {
        System.out.println("Adding cheese");
        this.cheese = true;
    }

    public void setType(BurgerType type)
    {
        this.type = type;
        System.out.println("Constructing " + type + " burger");
    }

    public void setAlooPatty() {
        this.alooPatty = true;
        System.out.println("Adding aloo patty");
    }

    public void setLettuce() {
        this.lettuce = true;
        System.out.println("Adding lettuce");
    }

    public void setOnion() {
        this.onion = true;
        System.out.println("Adding onion");
    }

    public void setTomato() {
        this.tomato = true;
        System.out.println("Adding tomato");
    }

    public void setChickenPatty() {
        this.chickenPatty = true;
        System.out.println("Adding chicken patty");
    }

    public void setMayonnaise() {
        this.mayonnaise = true;
        System.out.println("Adding mayonnaise");
    }


}
