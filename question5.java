class Book{
    void read(){
        System.out.println("read");
    }
}

class Novel extends  Book{
    void storyLine(){
        System.out.println("story");
    }
}

public class question5{
    public static void main(String[] args) {
        Novel obj = new Novel();
        obj.storyLine();
        obj.read();
    }
}
