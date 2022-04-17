package abstractFactoryPattern2;

public class MageFactory implements CharacterFactory{

    @Override
    public Outfit createOutfit() {
        return new Cloak();
    }

    @Override
    public Weapon provideWeapon() {
        return new Staff();
    }

}
