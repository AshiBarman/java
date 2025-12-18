import java.util.TreeSet;

public class Uniqueelement{
    public static void main(String[] args) {
        int[] arr = {1,2,2,42,4,3,5,7,53,45,3,5};
        TreeSet<Integer> set = new TreeSet<>();
        for(int i : arr){
            if(!set.add(i)){

            }
        }
    }
}


