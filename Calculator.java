import java.util.*;
class Calculator {
    public static void main(String [] args){
       Scanner in=new Scanner (System.in);
       System.out.println("Enter First Number ");
       int a= in.nextInt();
       System.out.println("Enter Second Number");
       int b= in.nextInt();
       System.out.println("Enter Command");
       char c= in.next().charAt(0);
       switch (c) {
        case '+' :
        System.out.println(a+b);
        break;
        case '-' :
        System.out.println(a-b);
        break;
        case '*' :
        System.out.println(a*b);
        break;
        case '%' :
        System.out.println(a%b);
        break;
        default :
        System.out.println("Invalid input");

       } 
         }
        }