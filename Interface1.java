interface Client{
    void print();
    void show();
}
class Dev implements Client{
    public void print(){
        System.out.println("Bill");
    }
    public void show(){
        System.out.println("chinese");
    }
}
class Interface1{
    public static void main(String[] args) {
        Dev d = new Dev();
        d.show();
        d.print();
    }
}