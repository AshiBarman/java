class Device{
    void powerOn(){
        System.out.println("powerOn");
    }
}

class Laptop extends Device{
    void boot(){
        System.out.println("boot");
    }
}

class GamingLaptop extends Laptop{
    void startGame(){
        System.out.println("startGame");
    }
}

public class question4{
    public static void main(String[] args) {
        GamingLaptop obj =new GamingLaptop();
        obj.startGame();
        obj.boot();
        obj.powerOn();
    }
}
