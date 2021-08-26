import java.util.Scanner;

public class Console {

    private static Scanner keyboard = new Scanner(System.in);

    // Don't need this method but notice the *overloading* of readNumber
    public static double readNumber(String prompt) {
        return keyboard.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max){
        double value;
        while(true){
            System.out.print(prompt);
            value = keyboard.nextFloat();
            if(value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " " + max);
        }
        return value;
    }
}
