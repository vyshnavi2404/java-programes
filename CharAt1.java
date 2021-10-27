import java.util.Scanner;
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
int len=s1.length();
int ncount=0;
int lcount=0;
int Ucount=0;
for(int i=0;i<len;i++)
{
if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
ncount=ncount+1;
if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
lcount=lcount+1;
if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
Ucount=Ucount+1;
else
count=count+1;
}
System.out.println("no of digits are:" +ncount);
System.out.println("no of lowercase letters  are:" +lcount);
System.out.println("no of uppercase letters  are:" +Ucount);
System.out.println("no of letters:"+count);
}
}
