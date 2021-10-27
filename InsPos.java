class InsPos
{
public static void main(String[] args)
{


int[] arr =new int[] {1,2,3,4,5,6,7,8,9,-1};
int value = Integer.parseInt(args[0]);
int pos=Integer.parseInt(args[1]);
int i;
arr[9]=arr[pos];//position
arr[pos]=value;
for(i=0;i<9;i++)
System.out.println(arr[i]+",");
}
}