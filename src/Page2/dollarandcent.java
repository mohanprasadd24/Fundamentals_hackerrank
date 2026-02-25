package Page2;
import java.util.*;
public class dollarandcent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt();
        int c1=sc.nextInt();
        int d2=sc.nextInt();
        int c2=sc.nextInt();
        int sum=d1+d2;
        int sum2=c1+c2;
        while(sum2>100){
            sum2=sum2-100;
            sum++;
        }
        System.out.println(sum);
        System.out.println(sum2);
    }
}
