class Multithread2{
    public static void main(String[] args) {
        System.out.println("idhar bilkul mat dekhoo");
        Thread t1 = new Thread(()->{
        System.out.println("hiiiiii");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("bye");
        });
        Thread t2 = new Thread(()->{
        System.out.println("hlooo");
        });
        t1.start();
        t2.start();
    }
}
