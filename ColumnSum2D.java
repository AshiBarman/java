public class ColumnSum2D {
    public static void ColumnSum(int [] [] arr) {
        for(int j = 0 ;j<arr[0].length;j++){
            int colSum = 0;
            for(int i =0;i<arr.length;i++){
                colSum+=arr[i][j];
            }
            System.out.println("column sum is :"+colSum);
        }
    }
    public static void main(String[] args) {
        int [] [] arr ={{1,2,3,4},{1,2,3,4}};
        ColumnSum(arr);
    }
}
