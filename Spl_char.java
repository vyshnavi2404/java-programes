class Spl_char
{
public static void main(String args[])
{
char c1='0';
if(c1=='A' || c1=='Z' || c1=='a' || c1=='z')
{
System.out.println("Alphabet");
}
else if(c1>=0 && c1<=10)
{
System.out.println("Number");
}
else
{
System.out.println("Special symbol");
}
}
}