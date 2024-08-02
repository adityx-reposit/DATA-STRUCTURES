public class binomial {
    public static int cal(int n){
        int fact=1,i;
        for(i=1;i<=n;i++){
            fact=fact*i;
        
          System.out.println("factorial is"+fact);
        }
        return 0;
    }
         
    public static int bincoeff(int n,int r){
      int rfact=1,nfact=1,reset=1;
      rfact=cal(r);
      nfact=cal(n);
      reset=cal(n-r);
      int bino=nfact/(rfact*reset);
      System.out.println(bino);
      return 0;

    }
   public static void main(String args[]){
    bincoeff(6,9);
    


   }
}
