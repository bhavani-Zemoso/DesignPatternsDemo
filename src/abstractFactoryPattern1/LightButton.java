package abstractFactoryPattern1;

public class LightButton implements Button{

    @Override
    public void create() {
        System.out.println("Creating a button for light theme");
    }
}
