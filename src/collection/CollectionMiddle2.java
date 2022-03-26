package collection;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class CollectionMiddle2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("/Users/alina/IdeaProjects/HOMEWORK/src/file1");
        File file2 = new File("/Users/alina/IdeaProjects/HOMEWORK/src/file2");

        FileReader fr = new FileReader(file1);
        PrintWriter pw = new PrintWriter(file2, "UTF-8");
        Scanner sc = new Scanner(fr);

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        while (sc.hasNext()) {
            int a = sc.nextInt();
            set.add(a);
        }
        fr.close();
        pw.close();
Object [] o = set.toArray();
        System.out.println(o.toString());

    }
}
