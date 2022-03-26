package IO;

import java.io.*;

public class IOEasy1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("/Users/alina/IdeaProjects/HOMEWORK/src/file1");
        FileReader reader = new FileReader(file1);
        BufferedReader buff = new BufferedReader(reader);
        String answer;
        if ((answer = buff.readLine()) != null) {

            System.out.println(answer);
        }


    }
}

