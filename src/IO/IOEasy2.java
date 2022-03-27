package IO;

import java.util.Scanner;

public class IOEasy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (sc.hasNextLine()) {
            a++;
            String s = sc.nextLine();
            System.out.println(a + " " + s);
        }
        sc.close();
        }

    }

