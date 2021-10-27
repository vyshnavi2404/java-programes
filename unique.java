//write a program to to display all the unique words of a string
import java.util.Arrays;
import java.util.HashSet;
class Example {
 
    public static void main(String[] args) {
 
        String str = "apple banana mango grape lichi mango apple grape";
         
        String[] words = str.split(" ");
         
        HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
         
        for(String s:uniqueWords)
            System.out.println(s);
    }
}
