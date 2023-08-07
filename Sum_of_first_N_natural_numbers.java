import java.util.Scanner;
public class h{
    public static void main(String[] a)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        // int sum = 0;
        // for(int i=1;i<=n;i++)
        // {
        //     sum = sum + i;
        // }
        // System.out.printf("%d",sum);
        int sum = (n * (n + 1) ) / 2;
        System.out.print(sum);
        }
}