
public class Method1{
    static void sum(){
        int a =123;
        int c=0;
           while(a>0){
            int b= a%10;
            c=c+b;
            a=a/10;
           }
         System.out.println(c); 
        }
    

    public static void main(String [] args) {
     sum();  
}     
}
    
