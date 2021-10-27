import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class sample {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter num1:");
        float temp1 = Float.parseFloat(reader.readLine());
  System.out.println("Enter num2: ");
  float temp2 = Float.parseFloat(reader.readLine());
  System.out.println(temp1+temp2);
    }
}