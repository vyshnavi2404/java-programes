class Sample
{
public static void main(String[] args)
{
int a=10;

System.out.println("the value of a is: "+a);
int b=++a;
System.out.println("the result of A-B is: "+b);
int c=a++;
System.out.println("the result of A*B is: "+c);
System.out.println("the final value of a is"+(a++));
}
}