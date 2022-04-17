package abstractFactoryPattern1;

public class Application {
    private NavigationBar navigationBar;
    private Button button;

    public Application(ThemeFactory factory)
    {
        navigationBar = factory.createNavigationBar();
        button = factory.createButton();
    }

    public void createComponents()
    {
        navigationBar.create();
        button.create();
    }
}
