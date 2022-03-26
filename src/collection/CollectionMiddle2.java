package collection;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class CollectionMiddle2 {
    public static void main(String[] args) throws IOException {
        File file3 = new File("/Users/alina/IdeaProjects/HOMEWORK/src/file3");
        File file4 = new File("/Users/alina/IdeaProjects/HOMEWORK/src/file4");

        FileReader fr = new FileReader(file3);
        PrintWriter pw = new PrintWriter(file4, "UTF-8");
        Scanner sc = new Scanner(fr);

        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        while (sc.hasNext()) {
            String a = sc.nextLine();
            hashSet.add(a);
        }
        fr.close();

        Object[] objects = hashSet.toArray();
        String [] array = new String[objects.length];
        for (int i = 0; i < objects.length; i++) {
            array[i] = (String) objects[i];
            pw.println(array[i]);
        }
        pw.close();
    }
}