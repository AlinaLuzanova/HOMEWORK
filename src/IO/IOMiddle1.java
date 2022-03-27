package IO;
//в файл записывается по три буквы столько раз, сколько строк в файле. Как их переделать в цифры?

import java.io.*;
import java.util.Scanner;


public class IOMiddle1 {
    public static void main(String[] args) throws IOException {

        File file1 = new File(args[0]);
        File file2 = new File(args[1]);

        PrintWriter writer = new PrintWriter(file2);
        Scanner sc = new Scanner(new FileReader(file1));

        int count = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            count++;

        }
        writer.close();
        writer.write(count);
        System.out.println("Successfully! ");
    }


}

