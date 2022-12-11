import java.util.*;
import java.io.*;
 
public class laba {
    public static void main(String args[]) throws IOException {

        try{

        OutputStream output = new FileOutputStream("file.txt");
        char c[] = {'3', '3', '3', '7'};
        for(int i = 0; i < c.length; i++) {
        output.write(c[i]); 
    }
        output.close();

        Stack<Integer> stack = new Stack<>();


        InputStream input = new FileInputStream("file.txt");
        int size = input.available();
        for(int j = 0; j < size; j++) {
        Integer readed = input.read();
        readed -= 48;

        stack.push(readed);
        System.out.print(readed);
    }
        input.close();     


        double avg = stack.stream().mapToInt(i -> i).average().orElse(0);
        System.out.println(avg);       
    } 

        catch(IOException e) {
        System.out.print("Exception");
    }  
}

}


