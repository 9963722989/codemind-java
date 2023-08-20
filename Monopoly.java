import java.util.*;
public class h{
    public static void main(String[] Args)
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
        int r1=s.nextInt();
        int r2=s.nextInt();
        int r3=s.nextInt();
        if(r1+r2<r3)
        {
            System.out.printf("YES%n");
        }
        else if(r1+r3<r2)
        {
            System.out.printf("YES%n");
        }
        else if(r2+r3<r1)
        {
            System.out.printf("YES%n");
        }
        else
        {
            System.out.printf("NO%n");
        }
      }
    }
}