
public class TwoDtooneD {
    public static void main (String [] args){
   int [] [] arr = {{2,4,5,6},{8,7,6,5}};
   int [] arr1 = new int [arr.length+arr[0].length];
   int k=0;
   for(int i=0;i<arr.length;i++){
    for(int j=0;i<arr[i].length;j++){
        arr1[k++]=arr[i][j];
    }
   }
   for(int i=0;i<arr1.length;i++){
   System.out.println(arr1[i]);
   }
    }
}
       
   