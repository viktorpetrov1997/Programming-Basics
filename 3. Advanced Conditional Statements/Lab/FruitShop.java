package AdvancedConditionalStatements;

import java.util.Scanner;

public class FruitShop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if(dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") ||
                dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday"))
        {
            switch(fruit)
            {
                case "banana": price = 2.50; break;
                case "apple": price = 1.20; break;
                case "orange": price = 0.85; break;
                case "grapefruit": price = 1.45; break;
                case "kiwi": price = 2.70; break;
                case "pineapple": price = 5.50; break;
                case "grapes": price = 3.85; break;
                default:
                    System.out.println("error");
                    return;
            }
            System.out.printf("%.2f", price * quantity);
        }
        else if(dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday"))
        {
            switch(fruit)
            {
                case "banana": price = 2.70; break;
                case "apple": price = 1.25; break;
                case "orange": price = 0.90; break;
                case "grapefruit": price = 1.60; break;
                case "kiwi": price = 3.00; break;
                case "pineapple": price = 5.60; break;
                case "grapes": price = 4.20; break;
                default:
                    System.out.println("error");
                    return;
            }
            System.out.printf("%.2f", price * quantity);
        }
        else
        {
            System.out.println("error");
            return;
        }
    }
}
