import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        int marks[]=new int[50];
        System.out.println("length of array is "+ marks.length);
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        System.out.println("enter marks of your respected subjecst");
        marks[1]=sc.nextInt();
        System.out.println("enter marks of your respected subjecst");
        marks[2]=sc.nextInt();
        System.out.println("enter marks of your respected subjecst");
            System.out.println("marks of physics is"+marks[0]);
            System.out.println("marks of chem is"+marks[1]);
            System.out.println("marks of maths is"+marks[2]);

        
    }
}
