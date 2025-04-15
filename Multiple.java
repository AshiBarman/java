import java.util.Scanner;
public class Multiple {
    public static void main (String [] args){
   Scanner in = new Scanner(System.in);
   System.out.println("Enter your number");
   int a = in.nextInt();
   if(a%3==0){
    System.out.println("multiple of 3");
   }
   else{
    System.out.println("not multiple of 3");
}
     }
}