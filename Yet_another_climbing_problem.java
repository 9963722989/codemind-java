import java.util.*;
public class h{
    public static void main(String[] Args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int x=s.nextInt();
            int y=s.nextInt();
            System.out.println(x/y+x%y);
        }
        
    }
     
}