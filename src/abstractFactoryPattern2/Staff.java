package abstractFactoryPattern2;

public class Staff implements Weapon{
    @Override
    public void provide() {
        System.out.println("Providing staff...");
    }
}
