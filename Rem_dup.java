class Rem_dup
{
public static void main(String[] args)
{


int[] arr =new int[] {1,2,3,4,5,6,7,8,9,1};
int ui=0;
arr int[i];
for(int i=0;i<10;i++)
{
int flag=0;
for(int j=0;j<ui;j++)
{
if(arr[j]==arr[i])
flag=1;	
break;
}
}
if(flag==0)
{
arr[ui]=arr[i];
ui=ui+1;
}
System.out.println(arr[i]+",");
}
}
