public class selection {
    public static void insertion(int arr[]) {
        
    }
    public static void select(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int min_value=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_value]>arr[j]){
                    min_value=j;
                }
            }
                int temp = arr[min_value];
                arr[min_value]=arr[i];
                arr[i]=temp;

        }
    }
    public static void bubble(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void insertionsort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            
        }
    }
    public static void printt(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
            int arr[]={5,4,1,3,2}; 

          
            System.out.println("unsorted array is ");
            printt(arr);
            bubble(arr);
            System.out.println("sorted array is");
            printt(arr);
            
    }
}

