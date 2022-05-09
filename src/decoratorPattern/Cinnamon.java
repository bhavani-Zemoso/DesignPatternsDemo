package decoratorPattern;

public class Cinnamon extends CondimentDecorator{

    Beverage beverage;

    public Cinnamon(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 45;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Cinnamon";
    }
}
