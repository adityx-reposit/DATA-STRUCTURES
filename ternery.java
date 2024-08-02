import java.util.*;
public class ternery {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        String s = (marks>=33) ? "pass" : "fail";
        System.out.println(s);
    }
}
