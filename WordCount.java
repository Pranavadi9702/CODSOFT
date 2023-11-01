import java.util.Scanner;
public class WordCount
{
    public static int countWord(String input)
    {
        int count=0;
        char ch[]=new char[input.length()];
        for(int i=0;i<input.length();i++)
        {
            ch[i]=input.charAt(i);
            if( ((i>0) && (ch[i]!=' ') && (ch[i-1]==' ') || (ch[0]!=' ') && (i==0)) )
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input=sc.nextLine();

        WordCount w=new WordCount();
        w.countWord(input);

        System.out.println(countWord(input) + " words");
    }
}