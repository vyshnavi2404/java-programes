import java.util.Scanner;
class CharAt
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
int len=str1.length();

System.out.println(str1.charAt(0));

System.out.println(str1.charAt(len/2));

System.out.println(str1.charAt(len-1));
}
}

