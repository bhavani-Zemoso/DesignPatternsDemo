package abstractFactoryPattern1;

public class DarkButton implements Button{

    @Override
    public void create() {
        System.out.println("Creating a button for the dark theme");
    }
}
