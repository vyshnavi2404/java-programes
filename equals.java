class Test
{
public static void main(String args[])
{
String str1="Hello world!";
String str2=new String(" welcome komali!");
char[] helloArray={'h','e','l','l','o','.'};
String a=new String("komali");
String b=str1.concat(a);
String helloString = new String(helloArray);
String s1="hello";
String s2="hello";
String s3="komali";
String s4="komali";
String str="how was your day?";
System.out.println(str.indexOf('r'));
System.out.println(str.indexOf("was");
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
System.out.println("komali".length());
System.out.println(str1.concat(a));
System.out.println(b);
}
}