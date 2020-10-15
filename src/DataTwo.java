import java.util.Scanner;
import java.util.HashMap;

public class DataTwo {

    public void hashMap(){

        Scanner customerInput = new Scanner(System.in);

        HashMap<String, String> car = new HashMap<String, String>();
        car.put("M3", "BMW");
        car.put("G350", "Lexus");
        car.put("Accord", "Honda");
        car.put("Highlander", "Toyota");

        System.out.println(car);

        System.out.println("Welcome! What make of car are you looking for?");
        
        String desiredCar = customerInput.nextLine();
        switch (desiredCar) {
            case "BMW":
                System.out.println("There is a BMW M3 in stock");
                break;
        
            case "Lexus":
                System.out.println("There is a Lexus G350 in stock");
                break;

            case "Honda":
                System.out.println("There is a Honda Accord in stock");
                break;

            case "Toyota":
                System.out.println("There is a Toyota Highlander in stock");
                break;

            default:
                System.out.println("Unfortunately, that make isn't in stock");
                break;
        }

    }
}