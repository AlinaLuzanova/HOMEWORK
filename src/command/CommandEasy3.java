package command;

import java.util.Scanner;

public class CommandEasy3 {
    public static void main(String[] args) {
        System.out.println("Enter word, press backspace");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter how many times you want to read this word");
        repeat(s);
    }
    public static void repeat(String s)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for(int i = 0;i<a;i++)
        {
            System.out.print(s + " ");
        }
    }
}