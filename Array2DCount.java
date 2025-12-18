
public class Array2DCount {
    public static void main (String [] args){
    //    Scanner in = new Scanner(System.in);
    //    System.out.println("Enter  array");   
    int [] [] arr = {{2,3,7,8},{4,5,6,1}};
    int totalCount=0;
    for(int i =0;i<arr.length;i++){
        totalCount = totalCount+arr[i].length;
    }
    System.out.println(totalCount);
    }
}
    
