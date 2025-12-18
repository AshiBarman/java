class downloadfile {
    String filename;
    public void file(){
        for(int i =1;i<=5;i++){
            System.out.println(filename+"downloading"+(i*20)+"%");
            try{
                Thread.sleep(2000);
            }catch(Exception e){
            }
        }
        System.out.println(filename+"done");
    }
}
class Singlethread{
    public static void main(String[] args){
        downloadfile obj = new downloadfile();
        obj.filename = "fileA";
        obj.file();
        obj.filename = "fileB";
        obj.file();
        }
    }