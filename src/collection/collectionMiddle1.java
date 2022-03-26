package collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;


public class collectionMiddle1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file3 = new File("/Users/alina/IdeaProjects/HOMEWORK/src/file3");
        FileReader reader = new FileReader(file3);
        Scanner scan = new Scanner(reader);

        TreeSet<String> tset = new TreeSet<>();
        while (scan.hasNext()) {
            tset.add(scan.nextLine());
        }
        Object[] objects = tset.toArray();
        String[] str = new String[objects.length];
        for (int i = 0; i < objects.length; i++) {
            str[i] = (String) objects[i];
        }

        int[] array1 = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array1[i] = str[i].length();
        }
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            for (int k = 0; k < str.length; k++) {
                if (str[k].length() == array1[i]) {
                    System.out.println(str[k]);

                }
            }
        }
    }
}
