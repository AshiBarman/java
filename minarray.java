public class minarray {
    public static void main(String[] args) {
        int[] arr={4,7,3,5};
        int min=arr[0];
         int min1=arr[0]; 
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                 min1=min;
                min=arr[i];
            }
        }
        System.out.println(min);
         System.out.println(min1);
    }
}
