class filedownload extends Thread{
    String filename;
    public filedownload(String filename){
        this.filename = filename;
    }
    public void run(){
        for(int i = 1 ;i<=5;i++){
            System.out.println(filename + "downloading"+(i*20)+"%");
            try{
                Thread.sleep(2000);
            }catch(Exception e){
            }
        }
            System.out.println(filename +"-"+ "done");
    }
}
class Multithreading1{
    public static void main(String[] args) {
        filedownload t1 = new filedownload("fileA");
        filedownload t2 = new filedownload("fileB");
        t1.start();
        t2.start();
    }
}
