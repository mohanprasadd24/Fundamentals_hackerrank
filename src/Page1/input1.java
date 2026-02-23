package Page1;

import java.util.*;
public class input1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        float cgpa=sc.nextFloat();
        char grade=sc.next().charAt(0);
        System.out.println("name: "+name);
        System.out.println("Age: "+age);
        System.out.println("CGPA: "+Math.floor(cgpa*100)/100);
        System.out.println("Grade: "+grade);
    }
}
