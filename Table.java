import java.util.Scanner;
public class Table {
    public static void main (String [] args){
   Scanner in = new Scanner(System.in);
   System.out.println("Enter your number");
   int a = in.nextInt();
for(int i=1;i<=10;i++)
{
    System.out.println(a*i);
}
    
    }
}