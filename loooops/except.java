import java.util.*;
public class except {
    public static void main(String[] args) {
        int n;
      
        Scanner sc = new Scanner(System.in);
       do{
           System.out.println("enter your number ");
           n =sc.nextInt();
          
           if(n%10 == 0){
            continue;
           }
            System.out.println("your number was"+ n);
        }
            while(n>0);
       
    }

    }


