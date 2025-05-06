class Person{
    void displayName(){
        System.out.println("Ashi");
    }
}

class Student extends Person{
    void displayClass(){
        System.out.println("4 sem");
    }
}

class Monitor extends Student{
    void checkDiscipline(){
        System.out.println(" discipline");
    }
}

 public class question2{
    public static void main(String[] args) {
        Monitor a=new Monitor(); 
            a.checkDiscipline();
            a.displayClass();
            a.displayName();
        } 
}
