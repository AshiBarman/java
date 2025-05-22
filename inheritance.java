class Animal{
    void eat(){
        System.out.println("eatinggg");
    }
}

class Dog extends Animal{
    void bark(){
    System.out.println("barkkkk");
    }
}

class cat extends Animal{
    void lazy(){
        System.out.println("lazyyyy");
    }
}
class horse extends Animal{
    void sleep(){
        System.out.println("sleepppppp");
    }
}

class inheritance{
    public static void main(String[] args){
        Dog obj=new Dog();
        cat c =new cat();
        horse a=new horse();
       obj.bark();
       obj.eat();
       c.lazy();
       a.sleep();
    }
}