class Main extends Thread{
    static int balance = 1000;
    int withdrawal;
    public Main(int withdrawal){
        this.withdrawal = withdrawal;
    }
    public void run(){
        if(balance >withdrawal){
            System.out.println("is going to withdrawal"+" "+withdrawal);
            try {
            Thread.sleep(2000);
        }
        catch(Exception e){
        }
        balance = balance - withdrawal;
        System.out.println("remaining balance is "+balance);
        }
        else {
            System.out.println("not enough balance for withdrawal");
        }
    }
}
public class Threadmain{
    public static void main(String[] args) {
        Main t1 = new Main(800);
        t1.start();
        Main t2 = new Main(500);
        t2.start();
    }
}
