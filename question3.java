class Shape {
    void draw(){
        System.out.println("Shape");
    }
}

class Circle extends Shape{
    void Area(){
        System.out.println("Circle");
    }
}

public class question3{
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.Area();
        obj.draw();
    }
}
