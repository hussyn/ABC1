package mic;

import java.io.*;
public class CountVowels{

public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String:");
String text = br.readLine();
int count = 0,blank=0;
for (int i = 0; i < text.length(); i++)
{
int c = text.charAt(i);
if ((c==97||c==65 )||( c==101||c==69 )||(c==105||c==73)||(c==111||c==79 )||(c==117||c==85))
{
count++;
}
if(c==32)
{
blank++;
}
}
System.out.println("Vowels :"+count);
System.out.println("Blank :"+blank);
System.out.println("Non Blank :"+(text.length()-blank));
}
}