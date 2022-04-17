package abstractFactoryPattern2;

public class GameApp {
    Outfit outfit;
    Weapon weapon;

    public GameApp(CharacterFactory characterFactory)
    {
        outfit = characterFactory.createOutfit();
        weapon = characterFactory.provideWeapon();

    }

    public void buildCharacter()
    {
        outfit.create();
        weapon.provide();
    }
}
