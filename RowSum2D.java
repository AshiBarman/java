// public class RowSum2D {
//     public static void main(String[] args){
//         int [] [] arr = {{1,2,3,4},{1,2,3,4}};     without method
//         for(int i = 0;i<arr.length;i++){
//             int rowSum=0;
//             for(int j = 0;j<arr[i].length;j++){
//                 rowSum+=arr[i][j];
//             }
//             System.out.println("row sum is:"+rowSum);
//         }
//     }

// }
public class RowSum2D{
    public static void RowSum(int [] [] arr){
        for(int i = 0;i<arr.length;i++){
            int rowSum = 0;
            for(int j =0;j<arr[i].length;j++){
                rowSum+=arr[i][j];
            }
            System.out.println("row sum is:"+rowSum);
        }
    }
    public static void main(String[] args){
        int [] [] arr= {{1,2,3,4},{1,2,3,4}};
        RowSum(arr);
    }
}