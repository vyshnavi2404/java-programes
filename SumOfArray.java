class sample {  
public static void main(String[] args) {  
int [] arr = new int [10];
int len=args.length;
for (int i = 0; i <len; i++)
arr[i]=Integer.parseInt(args[i]);
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
for(int i=0;i<len;i++)
//finding 1st max and 1st min
{
if(arr[i]>max)
max=arr[i];
if(arr[i]<min)
min=arr[i];
}
System.out.println("max is " +max);
System.out.println("min is " +min);
}  
}
