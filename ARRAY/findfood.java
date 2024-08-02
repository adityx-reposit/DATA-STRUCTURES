public class findfood {
    public static int Search(String food[], String find){
        for(int i=0;i< food.length;i++){
            if(food[i]==find){
                return i;
            }

        }
                return -1;
    }
    public static void main(String[] args) {
        String food[]={"aalu","chola","samosa","chat"};
        String find ="aalu";
        int data = Search(food, find);
        if(data==-1){
            System.out.println("your food is not available");

        }
        else{
            System.out.println("your food is available at"+data);

        
        }
        
    }
}
