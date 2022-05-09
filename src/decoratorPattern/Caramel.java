package decoratorPattern;

public class Caramel extends CondimentDecorator{

    Beverage beverage;

    public Caramel(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 35;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }
}
