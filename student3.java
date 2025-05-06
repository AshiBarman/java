import java.util.Scanner;
public class student3 {
    String name;
    int rollNumber;
    double marks;
     void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("RollNumber:"+rollNumber);
        System.out.println("Marks:"+marks);
    } 
}
public class StudentDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student student1=new Student();
        student1.name="Aditi";
        student1.rollNumber=1;
        student1.marks=90;
        Student student2=new Student();
        student2.name="Sejal";
        student2.rollNumber=2;
        student2.marks=91;
        Student student3=new Student();
        student3.name="Ayushi";
        student3.rollNumber=3;
        student3.marks=92;
        // Displaying student details

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}