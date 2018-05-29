import java.util.Scanner;
public class laba2 { 
public static void main(String[] args)
    {
        String t = readStr();
        if (isPolidrome(t))
            System.out.println(t+"- полиндром");
else
    {
        System.out.println(t + "- не полиндром");
    }
    }

    private static String readStr()
    {
        Scanner in = new Scanner(System.in);
        String t=in.nextLine();
        return t;
    }

    private static String reverseStr(String t)
    {
        String t1="";
        int n=t.length();
        for (int i=n-1; i>=0;i--)
        {
            t1+=t.charAt(i);
        }
        return t1;
    }
    public static boolean isPolidrome(String t)
    {
        String t1=reverseStr(t);
        return (t.equals(t1));
    } 
}