import java.util.*;
public class sum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i,n,sum_even=0,sum_odd=0;
       int a[]={12,9,3,4,10};
       for(i=0;i<5;i++){
        if(a[i]%2==0){
           sum_even=sum_even+a[i];

        }
        else{
           sum_odd=sum_odd+a[i];
        }
    }
        System.out.println("sum of even is"+ sum_even);
        System.out.println("sum of odd is"+sum_odd);   
    

    }
}
