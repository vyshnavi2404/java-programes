class Prime_1099
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
int num1=Integer.parseInt(args[1]);
int count=0;
for(int i=2;i<=Math.sqrt(num);i++)
{
if(num%i==0)
count++;
}
if(count==0)
System.out.println("Is prime");
else
System.out.println("Not prime");
}
}