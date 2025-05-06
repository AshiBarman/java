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

class puppy extends Dog{
    void lazy(){
      System.out.println("lazyyyy"); //multipleinheritance
    }
}

class Singleinheritance{
    public static void main(String[] args){
        puppy obj=new puppy();
       obj.bark();
       obj.eat();
       obj.lazy();
    }
}