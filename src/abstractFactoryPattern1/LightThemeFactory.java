package abstractFactoryPattern1;

public class LightThemeFactory implements ThemeFactory{

    @Override
    public NavigationBar createNavigationBar() {
        return new LightNavigationBar();
    }

    @Override
    public Button createButton() {
        return new LightButton();
    }
}
