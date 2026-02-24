package Page2;
import java.util.*;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        float r=sc.nextFloat();
        float n=sc.nextFloat();
        float si,a,d,f;
        si=(p*n*r)/100;
        a=si+p;
        d=si*0.02f;
        f=a-d;
        System.out.printf("%.2f\n",si);
        System.out.printf("%.2f\n",a);
        System.out.printf("%.2f\n",d);
        System.out.printf("%.2f\n",f);
    }


}
