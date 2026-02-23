package Page1;

import java.util.*;
public class ascii_input1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char letter=sc.next().charAt(0);
        System.out.print((int)letter);
    }
}

//public class Solution {
//
//    public static void main(String[] args) {
//
//        Scanner sc =new Scanner(System.in);
//        char alpha =sc.next().charAt(0);
//        if(alpha >=0 && alpha <=127)
//        {
//            int cham =(int)alpha;
//            System.out.println(cham);
//        }
//
//    }
//}
