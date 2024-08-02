public class linearsearch{
    public static int Search(int numbers[] ,int find,int food[],int foodSearch){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==find){
                return i;
            }
        }
        for(int j=0;j<food.length;j++){
            if(food[j]==foodSearch){
                return j;
            }
            
        }
                return -1;
    }
    public static void main(String[] args) {
     int numbers[]={1,2,3,4,5,6,7,8,9,12};
     String food[] = {"aalu","dosa","chola","samosa"};
     String foodSearch = "dosa";
     int find = 6;
     int index=Search(numbers, find);
        Search(numbers, find);
        if(index==-1){
            System.out.println("the number is not found");
        }
        else{
            System.out.println("found at "+index);
        }
    }
}