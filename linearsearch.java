public class linearsearch{
    static int LinearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return arr[i];
            }
            else{
                return -1;
            }
        }
    } 
    public static void main(String[] args){
        int[] arr={7,8,5,4};
        int target=4;
        LinearSearch(arr, target);
    }
    
    
}
