import java.util.Scanner;
public class Array4 {
    public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of  array");
    int n = in.nextInt();
    int[] arr = new int[n];
    int sum = 0;
    System.out.println("Enter element");
    for(int i=0;i<n;i++){
        arr[i]= in.nextInt();
        
    }
    int max = arr[0];
    for(int i =1;i<n;i++){
        if(arr[i]>max){
            max =  arr[i];
        }
    }
    System.out.println("Sum ="+sum);
    }
}

        
