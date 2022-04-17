package abstractFactoryPattern2;

public class Cloak implements Outfit{

    @Override
    public void create() {
        System.out.println("Creating a cloak...");
    }
}
