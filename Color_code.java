class Color_code
{
public static void main(String args[])
{
char a = args[0].charAt(0); 
if(a=='R')
{
System.out.println("red");
}
else if(a=='B')
{
System.out.println("blue");
}
else if(a=='G')
{
System.out.println("green");
}
else if(a=='O')
{
System.out.println("orange");
}
else if(a=='Y')
{
System.out.println("yellow");
}
else if(a=='W')
{
System.out.println("white");
}
else
{
System.out.println("invalid");
}
}
}