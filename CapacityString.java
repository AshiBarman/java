
public class CapacityString {
    public static void main(String[] args) {
        String a = "hello";
        StringBuilder str = new StringBuilder(30);
        str.append("hello byeeeeeeeeeeeeeeeeeeeeeeeeee");
        System.out.println(str.length());
        System.out.println(str.capacity());
}     
    }
