import java.util.*;
public class h{
    public static void main(String[] Args){
        Scanner s=new Scanner(System.in);
        double a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        double sc=(a+b+c)/2;
        double area=Math.sqrt((sc)*((sc-a)*(sc-b)*(sc-c)));
        System.out.printf("%.2f",area);
    } 
}