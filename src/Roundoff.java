import java.util.*;
public class Roundoff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float num=sc.nextFloat();
        System.out.println((int)num);
        System.out.println((int)Math.ceil(num));
        System.out.println(Math.round(Math.floor(num)));
    }
}
