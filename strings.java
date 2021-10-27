class Test
{
public static void main(String args[])
{
String str1="Hello world!";
String str2=new String(" welcome kusuma!");
char[] helloArray={'h','e','l','l','o','.'};
String a=new String("kusuma");
String b=str1.concat(a);
String helloString = new String(helloArray);
String s1="hello";
String s2="hello";
String s3="kusuma";
String s4="kusuma";
String str="how was a your Day?";
System.out.println(str.indexOf('r'));
System.out.println(str.indexOf("was"));
System.out.println(str.indexOf('a',6));
System.out.println(str.indexOf('a'));
System.out.println(str.indexOf("a",str.indexOf('a')+1));
System.out.println(str.lastIndexOf('a'));
System.out.println(str.indexOf('D'));
System.out.println(str.indexOf("D",str.indexOf('D')+1));
System.out.println(str.lastIndexOf('D'));
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s3.equals(s4));
System.out.println(s1.equals(s3));
System.out.println(s3.compareToIgnoreCase(s4));
System.out.println(s1.compareTo(s3));
System.out.println(s3.compareTo(s1));
System.out.println(s1.startsWith("he"));
System.out.println(s1.endsWith("lo"));
System.out.println(helloString);
System.out.println(str1);
System.out.println(str1.charAt(4));
System.out.println(str2);
System.out.println(str2.concat(a));
System.out.println(str2.length());
System.out.println(str1+str2);
System.out.println("kusuma ".length());
System.out.println(str1.concat(a));
System.out.println(b);
}
}