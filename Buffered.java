import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class sample {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter temperature:");
        int temp=Integer.parseInt(reader.readLine());
  System.out.println("today temperature is"+temp);
    }
}