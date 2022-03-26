package command;

import java.util.Scanner;

public class commandEasy3 {
    public static void main(String[] args) throws ExceptionNotInt {
    System.out.println("Type the string, press Enter and then type positive integer number");
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
        if (scanner.hasNextInt()) {
        int number = scanner.nextInt();
        if (number> 0) {
            for (int i = 0; i < number; i++) {
                System.out.println(text);
            }
        }
    }
         else {
        throw new ExceptionNotInt("You typed non-integer positive number");
    }

}
public class ExceptionNotInt extends Exception{
    public ExceptionNotInt(String message) {
        super(message);

    }

}


