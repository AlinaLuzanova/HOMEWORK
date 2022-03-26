package command;

import java.util.Scanner;

public class commandEasy1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("hello")){
            System.out.println("Hello, world!");
        }

    }
}
