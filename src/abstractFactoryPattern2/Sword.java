package abstractFactoryPattern2;

public class Sword implements Weapon{
    @Override
    public void provide() {
        System.out.println("Providing sword...");
    }
}
