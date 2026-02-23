import java.util.*;
public class firstlastpos_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp= sc.nextInt();
        inp = Math.abs(inp);
        int f= inp/1000;
        int l= inp%10;
        int res=f+l;
        System.out.print(res);
    }
}
