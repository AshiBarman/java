class Signalname{
    public boolean isSignaled = false;
    public synchronized void SendSignal(){
        isSignaled = true;
        System.out.println("Producer: sending Signal");
        notify();
    }
    public synchronized void waitforSignal(){
        while(!isSignaled){
            try{
                System.out.println("Consumer:waiting for Signal");
                wait();
        }
        catch(Exception e){
        }
    }
        System.out.println("Consumer got the Signal");
}
}
public class WaitandNotify{
    public static void main(String[] args) {
        Signalname obj = new Signalname();
        Thread consumer = new Thread(()->{
            obj.waitforSignal();
        });
        Thread producer = new Thread(()->{
            try{
                Thread.sleep(2000);
            }catch(Exception e){
            }
            obj.SendSignal();
        });
        consumer.start();
        producer.start();

    }
}
