import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class sample {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("write your name:");
        String name = reader.readLine();
  System.out.println("type your fav no(between 1 to 10):");
  int favn=Integer.parseInt(reader.readLine());
  System.out.println("welcome"+name+"your fav no is"+favn);
    }
}
// write a java program to get a todays temp as user input and show on screen