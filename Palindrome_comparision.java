class StringPalindrome
{
public static void main(String args[])
{
String str="SaaSaAs";
int flag=0;
int n=str.length();
str=str.toLowerCase();
for(int i=0;i<(n/2);i++)
{
if(str.charAt(i)!= str.charAt(n-i-1))
flag=1;
break;
}
if(flag==0)
System.out.println(str+" is a palindrome");
else
System.out.println(str+" is not a palindrome");
}
}