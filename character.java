
public class character {
    public static void main(String[] args) {
    String str = "education";
    int total=0;
    int target ='a';
    for(int i =0;i<str.length();i++){
        if(str.charAt(i)==target){
            total++;
        }
    }
    System.out.println(total);
     
}
}     
    
