
package collection;
// push not add, pop not remove
import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class collectionEasy1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("/Users/alina/IdeaProjects/HOMEWORK/src/file1");
        File file2 = new File("/Users/alina/IdeaProjects/HOMEWORK/src/file2");

        FileReader fr = new FileReader(file1);
        PrintWriter pw = new PrintWriter(file2);

        Scanner sc = new Scanner (fr);
        Stack<Integer> st = new Stack<>();

        while(sc.hasNext())
        {
            int a = sc.nextInt();
            if (a > 0){
                st.push(a);
            } else if(a == 0) {
                st.push(a);
                break;
            }
        }
        pw.close();


        while (st.size() != 0){
            Integer a = st.pop();
            pw.println(a);
        }
        pw.close();


    }
}
