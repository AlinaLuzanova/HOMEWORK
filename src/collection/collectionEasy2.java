package collection;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.io.FileNotFoundException;
import java.io.IOException;



public class collectionEasy2  {
    public static void main(String[] args) throws Exception {

        File file1 = new File("/Users/alina/IdeaProjects/HOMEWORK/src/file1");
        FileReader reader = new FileReader(file1);
        Scanner sc = new Scanner(reader);
        int number = sc.nextInt();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < number; i++) {
            arrayDeque.add(sc.nextInt());
        }

        Object [] array = arrayDeque.toArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}