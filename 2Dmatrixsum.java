public class 2Dmatrixsum {
    public static void main(){
        int [][] arr ={{1,3,5},{4,7,5},{7,9,5}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                sum+= arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
