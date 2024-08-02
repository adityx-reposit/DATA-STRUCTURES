class reverse{
    public static void main(String[] args) {
        int n =10899,last,reverse;
        while(n>0){
             last =n%10;
             reverse=last;
             n=n/10;
             System.out.print(reverse);
        }
            System.out.println();
    }
}