public class binary {
    public static int BinarySearch(int arr[], int search , int first,int last){
         for(int i=0;i<arr.length;i++){
        int mid=(first+last)/2;
           if(search==mid){
            return i;
           }
           if(search<mid){
            mid=first+1;
           }
           if(search> mid){
            mid=last-1;
           }        
        
}
return -1;   
}
   public static void main(String[] args) {
     int arr[]={54,87,47,58,66,74};
     int first=arr[0],mid=0,last=arr[5];
     int search=66;
     int index=BinarySearch(arr, search, first, last);
        if(index==-1){
            System.out.println("number not found");

        }
        else{
            System.out.println("number found AT"+index);
        }
    }
}