import java.util.*;
public class basic {
    public static void printworld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return ;
    }
    public static int calculatesum(int num1,int num2){
       
        int sum=num1+num2;
        System.out.println(sum);
        return 1;
    }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("please enter your number");
    int num1=sc.nextInt();
    int num2= sc.nextInt();
   calculatesum(num1,num2);
   printworld();
}
}
