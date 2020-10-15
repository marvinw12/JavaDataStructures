import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Data {

    public void run(){

        ArrayList<Integer> numbers = new ArrayList<Integer>(5);

        Scanner userInput = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Please type a number (1-100)");
            numbers.add(Integer.parseInt(userInput.nextLine()));
        }

        System.out.println(numbers.toString());

    
        int sum = 0; 
        for(int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        } System.out.println("Total: " + sum + ".");

        int product = 1; 
        for(int i = 0; i < numbers.size(); i++) {
            product *= numbers.get(i);
        } System.out.println("Numbers multiplied: " + product + ".");


        Object numbersMax = Collections.max(numbers);
        System.out.println("Largest number: " + numbersMax + ".");

 
        Object numbersMin = Collections.min(numbers);
        System.out.println("Smallest number: " + numbersMin + ".");

}
}
