class ElseIfDemo
{
public static void main(String args[])
{
int month=Integer.parseInt(args[0]);
if(month==12 || month==1 || month==2)
{
System.out.println("winter");
}
else if(month==3 || month==4 || month==5)
{
System.out.println("summer");
}
else if(month==6 || month==7 || month==8)
{
System.out.println("rainy");
}
else if(month==9 || month==10 || month==11)
{
System.out.println("autumn");
}
else
{
System.out.println("invalid month");
}
}
}