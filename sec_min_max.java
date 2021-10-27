class sample {  
public static void main(String[] args) {  
int [] arr = new int [10];
int len=args.length;
int sum=0;
for (int i = 0; i <len; i++)
arr[i]=Integer.parseInt(args[i]);
int max=Integer.MIN_VALUE;
int secondmax=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
int secondmin=Integer.MAX_VALUE;
for(int i=0;i<len;i++)
{
sum=sum+arr[i];
if(arr[i]>max)
max=arr[i];
if(secondmax<arr[i] && arr[i]!=max)
secondmax=arr[i];
if(arr[i]<min)
min=arr[i];
if(secondmax>arr[i] && arr[i]!=min)
secondmin=arr[i];
}
System.out.println("sum is " +sum);
System.out.println("max is " +max);
System.out.println("min is " +min);
System.out.println("secondmax is " +secondmax);
System.out.println("secondmin is " +secondmin);
}  
}
