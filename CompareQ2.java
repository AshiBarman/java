import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int Age;
    String Name;
    public Student(int Age, String Name){
        this.Age = Age;
        this.Name = Name;
    }
    public String toString(){
        return Age + " " + Name;
    }
    public int compareTo(Student s){
        return this.Age-s.Age;
    }
}
class CompareQ2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(20,"Aditya"));
        list.add(new Student(19,"Rohan"));
        Collections.sort(list);
        for(Student s : list){
            System.out.println(s.toString());
        }
    }
}

