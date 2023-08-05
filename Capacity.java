import java.util.Scanner;
public class C{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int V=s.nextInt();
        int V1=s.nextInt();
        int V2=s.nextInt();
        int V4=2*V*V1*V2*512;
        System.out.printf("%d KB",V4/1024);
    }
}