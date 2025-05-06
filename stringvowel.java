
public class stringvowel {
    public static void main(String[] args) {
    String a = "education";
   int total = 0;
   int consonant =0;
   for(int i =0;i<a.length();i++){
    if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
        total++;
      
   }
}
   consonant=consonant+a.length()-total;
   System.out.println(consonant);
}
}     
    
