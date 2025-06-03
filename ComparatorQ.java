import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int rollno;
    String name;
    int age;
    public Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return age + " " + name + " " + rollno;
    }
}
class SortByName implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class SortByAge implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.age - s2.age;
    }
    }
    class SortByRollno implements Comparator<Student>{
        public int compare(Student s1 , Student s2){
            return s1.rollno - s2.rollno;
        }
    }
class ComparatorQ {
    public static void main(String[] args) {
        ArrayList<Student>list = new ArrayList<>();
        list.add(new Student(58, "Ashi", 19));
        list.add(new Student(125, "Mehar", 20));
        Collections.sort(list,new SortByName());
        Collections.sort(list,new SortByAge());
        Collections.sort(list,new SortByRollno());
        for(Student s : list){
            System.out.println(s.toString());
        }
    }
}
