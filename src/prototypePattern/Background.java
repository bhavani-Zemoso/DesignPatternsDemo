package prototypePattern;

public class Background {
    public static void main(String[] args) throws CloneNotSupportedException {

        Building building = new Building(12,6);

        Building level1Building;

        System.out.println("Level 1 : \n");
        for(int i = 0; i < 5; i++)
        {
            level1Building  = (Building)building.clone();
            level1Building.setColor("Red");
            System.out.println(level1Building);
        }

        System.out.println();

        Building level2Building;

        System.out.println("Level 2 : \n");
        for(int i = 0; i < 10; i++)
        {
            level2Building = (Building) building.clone();
            level2Building.setColor("Green");
            System.out.println(level2Building);
        }

        System.out.println();

        Building level3Building;

        System.out.println("Level 3 : \n");
        for(int i = 0; i < 15; i++)
        {
            level3Building = (Building) building.clone();
            level3Building.setColor("Blue");
            System.out.println(level3Building);
        }

        System.out.println();

        System.out.println("----- FINISH LINE ------");
    }
}
