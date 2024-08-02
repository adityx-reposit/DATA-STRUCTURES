public class joseph {
    public static int josa(int n,int k) {
        if(n==1)
        return 1;
        else
        return (josa(n-1, k)+k-1)%n+1;
    }
    public static void main(String[] args) {
        int n=4;
        int k=2;
        System.out.println("chosen place is "+ josa(n, k));
    }
}
