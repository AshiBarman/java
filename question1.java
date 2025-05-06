class Employee{
    void work(){
        System.out.println("work");
    }
}

class Manager extends Employee{
    void Meeting(){
        System.out.println("Meeting");
    }
}

class question1{
    public static void main(String[] args) {
        Manager obj=new Manager();
        obj.Meeting();
        obj.work();
    }
}