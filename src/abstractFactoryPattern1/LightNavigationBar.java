package abstractFactoryPattern1;

public class LightNavigationBar implements NavigationBar{
    @Override
    public void create() {
        System.out.println("Creating a navigationBar for the light theme");
    }
}
