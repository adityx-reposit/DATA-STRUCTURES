public class findlarge {
    public static int Search(int value[],int max){
        for(int i=0;i<value.length;i++){
          if(value[i]>max){
            max=value[i];
          }
        }
        return max;
        
    }
    public static void main(String[] args) {
        int value[]={54,87,96,78,14};
        int max=Search(value, 0);
        System.out.println(max);

    }
}
