package collection;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class collectionEasy3 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("/Users/alina/IdeaProjects/HOMEWORK/src/file1");

        FileReader reader = new FileReader(file1);
        LinkedList <Integer> lList = new LinkedList<>();
        Scanner sc = new Scanner (reader);

        while(sc.hasNext())
        {
            int a = sc.nextInt();
            if (a == 0){
                break;
            } else if(a > 0) {
                lList.push(a);
            }
        }
        reader.close();
        System.out.println(lList);
    }
}
