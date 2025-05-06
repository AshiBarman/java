class Student{
    String name="Anjali";
    int age=18;
    
    Student(String name,int age){
        name=name;
        age=age;
        System.out.println(name+" "+age);
    }
} 
class constructor {
    public static void main(String[] args) {
        Student obj=new Student("Ashi", 19);
        // System.out.println(obj.name);
    }
}
