package abstractFactoryPattern2;

public class Armor implements Outfit{
    @Override
    public void create() {
        System.out.println("Creating an armor...");
    }
}
