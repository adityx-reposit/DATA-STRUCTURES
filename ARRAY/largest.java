public class largest {
    public static void main(String[] args) {
        int large=0,small=Integer.MAX_VALUE,i;
        int ar[]={1,2,6,3,15};
        for(i=0;i<ar.length;i++){
            if(ar[i]> large){
              large=ar[i];
            }
            if(ar[i]<small){
                small=ar[i];
            }
            
    }
        System.out.println("largest number is "+large);
        System.out.println("smallest number is "+ small);
    }
}
