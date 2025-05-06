
public class Variable{
int a = 89;  //instance variable
static int c =58;
   public static void main(String[] args) {
    System.out.println(Variable.c);
     int b=78;//local variable 
     System.out.println(b);
    
    Variable obj =new Variable();
    System.out.println(obj.a);
   }  
}     

    
