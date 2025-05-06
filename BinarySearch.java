public class BinarySearch {
    static int binarySearch(int[] a,int target){
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=start+end/2;
            if(a[mid]==target){
                return mid;
            }
            if(a[mid]<target){
                start=mid+1;
        
            }
            else{
                end=mid-1;
            }
    
        }
        return -1;
    }
    
}
public static void  main (String[] args){
    int[] a={2,4,6,8};
    int target=6;
    BinarySearch(a,target);
}