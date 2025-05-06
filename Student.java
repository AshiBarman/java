 import java.util.*;
 class Student {
   public Object name;
   public String rollNumber;
   public String marks;

   void student(){ 
    String name;
    int rollNumber;
    int age;
    int marks;
   }
   public void classstudetails(String name,int rollNumber,int age,int marks){
    System.out.println("name:" + name );
    System.out.println("rollNumber:" + rollNumber);
    System.out.println("age:" + age);
    System.out.println("marks:" + marks);
   }

   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter name:");
    String name = in.nextLine();
    System.out.println("Enter rollNumber:");
    int rollNumber = in.nextInt();
    System.out.println("Enter age:");
    int age = in.nextInt();
    System.out.println("Enter marks:");
    int marks = in.nextInt();
    }
   }

