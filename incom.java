import java.util.*;
public class incom {
    public static void main(String[] args) {
       int income,tax;
       Scanner s = new Scanner(System.in) ;
       income= s.nextInt();
       if (income< 500000) {
          tax=0;
        System.out.println("your tax is "+ tax);
       }
       else if(income>=500000 && income <1000000){
          tax = (income*10)/100;
          System.out.println("your tax is "+ tax);
       }
       else{
        tax=(income%20)/100;
        System.out.println("your tax is "+ tax);
       }
    }
}
