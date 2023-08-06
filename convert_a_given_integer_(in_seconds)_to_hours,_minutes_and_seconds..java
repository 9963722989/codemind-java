import java.util.*;
public class h{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int c=s.nextInt();
        int h=c/3600;
        int m=(c-(3600*h))/60;
        int z=(c-(3600*h))-(m*60);
        System.out.printf("H:M:S-%d:%d:%d",h,m,z);
    }
}