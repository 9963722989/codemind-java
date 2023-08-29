import java.util.*;
public class h{
    public static void main(String[] Args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}