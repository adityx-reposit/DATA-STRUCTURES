public class factorila {
   public static int cal(int n){
    int fact=1,i;
    for(i=1;i<=n;i++){
        fact=fact*i;
    
      System.out.println("factorial is"+fact);
    }
    return 0;
}
   public static void main(String args[]){
    
    cal(6);
   }
}