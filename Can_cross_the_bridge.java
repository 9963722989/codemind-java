import java.util.Scanner;
public class M{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int X=s.nextInt();
        int Y=s.nextInt();
        int Z=s.nextInt();
        int n=(Z-Y)/X;
        System.out.printf("%d",n);
    
    }
}