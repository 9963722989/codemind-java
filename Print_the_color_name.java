import java.util.*;
public class h{
    public static void main(String[] a)
    {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        if(ch=='V')
        {
            System.out.printf("Voilet");
        }
        else if(ch=='I')
        {
            System.out.printf("Indigo");
        }
        else if(ch=='B')
        {
            System.out.printf("Blue");
        }
        else if(ch=='G')
        {
            System.out.printf("Green");
        }
        else if(ch=='Y')
        {
            System.out.printf("Yellow");
        }
        else if(ch=='O')
        {
            System.out.printf("Orange");
        }
        else if(ch=='R')
        {
            System.out.printf("Red");
        }
        else
        {
            System.out.printf("-1");
        }
    }
    
}