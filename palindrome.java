class sample    
{  
public static void main(String args[])  
{  
int n=Integer.parseInt(args[0]);
int digit, sum = 0;  
int temp=n;  
while(n> 0)  
{      
digit = n % 10;    
sum = sum*10 + digit;    
n = n / 10;  
}   
if(temp==sum) 
System.out.println("Is palindrome");
else
System.out.println("Not palindrome");
}  
}