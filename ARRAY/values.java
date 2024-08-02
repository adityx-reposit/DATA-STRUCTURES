import java.util.Scanner;
public class values {
    public static void main(String[] args) {
        int marks[]= new int[10];

        Scanner ar = new Scanner(System.in);
        marks[0]= ar.nextInt();
        marks[1]= ar.nextInt();
        marks[2]= ar.nextInt();
        System.out.println("chemistry marks are "+ marks[0]);
        System.out.println("physics marks are "+ marks[1]);
        System.out.println("maths marks are "+ marks[2]);
        marks[2]= marks[2]+1;
        System.out.println("final marks is "+ marks[2]);
    } 
}
