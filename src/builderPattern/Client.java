package builderPattern;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BurgerBuilder builder = new BurgerBuilder();
        Director director = new Director(builder);

        System.out.println("Choose the type of burger:\n" +
                "Press 1 for a cheese burger\n" +
                "Press 2 for a veggie burger\n" +
                "Press 3 for a chicken burger\n" +
                "Press 4 for a AlooPatty burger\n" +
                "Enter your choice:");

        int choice = sc.nextInt();

        switch(choice)
        {
            case 1 : director.serveCheeseBurger();
            break;

            case 2 : director.serveVeggieBurger();
            break;

            case 3 : director.serveChickenBurger();
            break;

            case 4 : director.serveAlooPattyBurger();
            break;

            default :
                System.out.println("Invalid choice");
        }
    }
}
