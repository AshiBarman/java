import java.util.Scanner;
public class Fact {
    public static void main (String [] args){
   Scanner in = new Scanner(System.in);
   System.out.println("Enter your number");
   int a = in.nextInt();
for (int i=0;i<=10;i++){
    System.out.println(a*i);
}
     }
}