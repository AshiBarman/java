import java.util.ArrayList;
import java.util.Collections;

class CompareQ{
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(2);
        Collections.sort(list);
        System.out.println(list);
    }
}
