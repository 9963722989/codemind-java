import java.util.*;
public class h{
    public static void main(String[] a)
    {
        Scanner s=new Scanner(System.in);
        char v=s.next().charAt(0);
        if(v>='A' && v<='Z')
        {
            System.out.printf("uppercase alphabet");
        }
        else if (v >= 'a' && v <= 'z')
        {
            System.out.printf("lowercase alphabet");
        }
        else{
            System.out.println("not an alphabet");
        }
    }
}