package abstractFactoryPattern2;

import java.util.Scanner;

public class Player {

    static Scanner reader = new Scanner(System.in);

    private static GameApp selectCharacter()
    {
        GameApp app;
        CharacterFactory character;

        System.out.println("Enter your character : ");
        String characterName = reader.nextLine();

        if(characterName.equalsIgnoreCase("Warrior"))
            character = new WarriorFactory();
        else
            character = new MageFactory();

        app = new GameApp(character);

        return app;
    }
    public static void main(String[] args) {
        GameApp app = selectCharacter();

        app.buildCharacter();
    }
}
