
public class palindrome {
    public static void main(String[] args) {
        String str = "Ashi";
        String str1 = "Ashi";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
<<<<<<< HEAD
            for(int i=0;i<str.length();i++){
=======
        for(int i=0;i<str.length();i++){
>>>>>>> d45ca2db4575a93f6648c8613fd20b4148a433cb
        for(int j=str.length ()-1;j>=0;j--){
            if(str.charAt(i)==str1.charAt(j)){
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");
            }
        
        
        
    
    }
}
}
}