package decoratorPattern;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Beverage beverage = null;
        System.out.println("Welcome to CoffeeShop");
        System.out.println("Please choose your coffee : " +
                "\n 1.Espresso" +
                "\n 2.Decaf" +
                "\n 3.HouseBlend");
        int choice;
        choice = sc.nextInt();

        switch(choice)
        {
            case 1 : beverage = new Espresso();
            break;

            case 2 : beverage = new Decaf();
            break;

            case 3 : beverage = new HouseBlend();
            break;

            default :
                System.out.println("Invalid choice");
        }

        System.out.println("Select your condiments : ");

        int condimentChoice;

        while(true)
        {
            System.out.println("1. Caramel" +
                    "\n 2. Chocolate" +
                    "\n 3.Whipped Cream" +
                    "\n 4.Cinnamon");
            condimentChoice = sc.nextInt();

            switch(condimentChoice)
            {
                case 1 : beverage = new Caramel(beverage);
                    break;
                case 2 : beverage = new Chocolate(beverage);
                    break;
                case 3 : beverage = new WhippedCream(beverage);
                    break;
                case 4 : beverage = new Cinnamon(beverage);
                    break;
            }

            System.out.println("Need any more condiments? Press N/n for No : ");
            char ch = sc.next().charAt(0);

            if(ch == 'N' || ch == 'n')
                break;
        }

        System.out.println(beverage.getDescription() + "\n You need to pay : " + beverage.cost());

    }
}
