package abstractFactoryPattern1;

public class DarkThemeFactory implements ThemeFactory{
    @Override
    public NavigationBar createNavigationBar() {
        return new DarkNavigationBar();
    }

    @Override
    public Button createButton() {
        return new DarkButton();
    }
}
