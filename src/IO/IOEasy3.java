package IO;
//done
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IOEasy3 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/alina/IdeaProjects/HOMEWORK/src/file1");
        Scanner s = new Scanner(path);
        ArrayList<String> fileList = new ArrayList<>();
        while (s.hasNext()){
            fileList.add(s.next());
        }
        s.close();


        int largestString = fileList.get(0).length();
        int index = 0;

        for(int i = 0; i < fileList.size(); i++) {
            if(fileList.get(i).length() > largestString) {
                largestString = fileList.get(i).length();
                index = i;
            }
        }

        System.out.println("String " + fileList.get(index) + " " + "is the longest one");

    }
}
