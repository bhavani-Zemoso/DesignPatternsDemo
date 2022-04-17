package abstractFactoryPattern1;

public class DarkNavigationBar implements NavigationBar{
    @Override
    public void create() {
        System.out.println("Navigation bar for the dark theme");
    }
}
