import java.util.*;
public class h{
    public static void main(String[] Args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            String s1=s.next();
            int z=Integer.parseInt(s1,2);
            System.out.println(Integer.toString(z,8));
        }
    }
}