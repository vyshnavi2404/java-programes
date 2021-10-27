class sample {
public static void main(String args[])
{
int []arr=new int[]{1,2,3,4,5,6,7,8,9,-1};
int value=Integer.parseInt(args[0]);
int pos=Integer.parseInt(args[1]);
for(int i=9;i>=pos;i--)
{
arr[i]=arr[i-1];
}
arr[pos-1]=value;
for(int i=0;i<10;i++)
System.out.println(arr[i] +",");
}
}