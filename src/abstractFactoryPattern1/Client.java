package abstractFactoryPattern1;

import java.util.Scanner;

public class Client {

    static Scanner reader = new Scanner(System.in);

    private static Application selectTheme()
    {
        Application app;
        ThemeFactory factory;

        System.out.println("Enter a theme of your choice");
        String theme = reader.nextLine();

        if(theme.equalsIgnoreCase("light"))
            factory = new LightThemeFactory();
        else
            factory = new DarkThemeFactory();

        app = new Application(factory);
        return app;

    }
    public static void main(String[] args) {
        Application app = selectTheme();
        app.createComponents();
    }
}
