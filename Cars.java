import java.util.*;
public class h{
    public static void main(String[] Args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int x=s.nextInt();
        if(a>b)
        {
            System.out.print(-1);
        }
        else
        {
            int y=((a+x)/(b))+1;
            System.out.print(y);
        }
    }
}