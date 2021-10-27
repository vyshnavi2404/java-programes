class Even_range
{
public static void main(String args[])
{
int a1=Integer.parseInt(args[0]);
int a2=Integer.parseInt(args[1]);
for(int i=a1;i<=a2;i++)
if(i%2==0)
{
System.out.println(i+" ");
}
}
}