package decoratorPattern;

public class WhippedCream extends CondimentDecorator{

    Beverage beverage;

    public WhippedCream(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 25;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", WhippedCream";
    }
}
