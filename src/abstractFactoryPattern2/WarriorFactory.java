package abstractFactoryPattern2;

public class WarriorFactory implements CharacterFactory{

    @Override
    public Outfit createOutfit() {
        return new Armor();
    }

    @Override
    public Weapon provideWeapon() {
        return new Sword();
    }

}
