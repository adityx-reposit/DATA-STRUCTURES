public class swap {
    public static int swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a value is"+ a);
        System.out.println("b value is"+ b);
        return 0;

    }
    public static void main(String[] args) {
        int a=90;
        int b=10;
        swap(a, b); // function isn called here by value 
    }
}
