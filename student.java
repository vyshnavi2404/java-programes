import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class sample {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("write your name:");
        String name = reader.readLine();
  System.out.println("enter sub marks:");
  float sub1=Float.parseFloat(reader.readLine());
  float sub2=Float.parseFloat(reader.readLine());
  float sub3=Float.parseFloat(reader.readLine());
  System.out.println("sum is:");
  System.out.println(sub1+sub2+sub3);
  System.out.println("average is:");
  System.out.println((sub1+sub2+sub3)/3);
     }
}