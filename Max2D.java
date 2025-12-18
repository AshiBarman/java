public class Max2D {
    public static void Max(int [] [] arr) {
        int max = arr[0][0];
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Maximum Element is :"+max);
    }
    public static void main(String[] args) {
        int [] [] arr ={{1,4,7,8},{3,2,5,9}};
        Max(arr);
    }
}
