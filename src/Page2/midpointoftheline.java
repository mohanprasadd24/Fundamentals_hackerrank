package Page2;
import java.util.*;
public class midpointoftheline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        float x3=(x1+x2)/2.0f;
        float y3=(y1+y2)/2.0f;
        System.out.printf("Arun's house is located at(%.1f,%.1f)",x3,y3);
    }
}
