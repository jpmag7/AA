import java.util.Scanner;

import Engine.Engine;
import Factory.AffordableCarFactory;
import Factory.CarFactory;
import Factory.CheapCarFactory;
import Factory.ExpensiveCarFactory;
import Interior.Interior;
import Transmission.Transmission;

public class Main{
    public static void main(String[] args) {
        
        // Print Menu
        System.out.println("What car do you want?");
        System.out.println("1. Expensive Car");
        System.out.println("2. Affordable Car");
        System.out.println("3. Cheap Car");
        System.out.println("4. Exit");

        // Get selected choice
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice < 1 || choice > 4){
            System.out.print("> ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("\033[1A\033[2K");
            }
            choice = scanner.nextInt();
            System.out.print("\033[1A\033[2K");
            if (choice == 4){
                scanner.close();
                return;
            }
        }
        System.out.print("Choose interior color: ");
        String color = scanner.next();
        scanner.close();
        
        // Create a car factory
        CarFactory factory = null;
        switch (choice) {
            case 1:
                factory = new ExpensiveCarFactory();
                break;
            case 2:
                factory = new AffordableCarFactory();
                break;
            case 3:
                factory = new CheapCarFactory();
                break;
            default:
                return;
        }

        // Create car parts
        Engine engine = factory.createEngine();
        Transmission transmission = factory.createTransmission();
        Interior interior = factory.createInterior(color);

        // Print car parts stats
        System.out.println("#####################");
        System.out.println("Engine: " + engine.getName() + " - " + engine.getPrice() + "$ - Weight: " + engine.getWeight());
        System.out.println("Transmission: " + transmission.getName() + " - " + transmission.getPrice() + "$ - Type: " + transmission.getType());
        System.out.println("Interior: " + interior.getType() + " - " + transmission.getPrice() + "$ - Color: " + interior.getColor());
        System.out.println("Total Cost: " + (engine.getPrice() + transmission.getPrice() + interior.getPrice()));
        System.out.println("#####################");
    }
}