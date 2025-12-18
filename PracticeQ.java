import java.util.TreeSet;
public class PracticeQ{
    public static void main(String[] args) {
        int[] arr = {1,2,2,42,4,5,7,53,45,3,5};
        TreeSet<Integer> a = new TreeSet<>();
        for(int i : arr){
            if(a.contains(i)){
                System.out.println(i);
                // break;
            }
            a.add(i);
            }
            System.out.println(a);
        }
        
    }

