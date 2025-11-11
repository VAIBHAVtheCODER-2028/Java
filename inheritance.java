public class inheritance {
    public static void main(String[] args){
        
      //inherits everything from Animal class;
        Dog myDog=new Dog();
        myDog.eat();
        myDog.sleep();
        myDog.bark();
    }
}

//Superclass(Parent)
class Animal{
    void eat(){
        System.out.println("Animal is Eating.");
    }

    void sleep(){
        System.out.println("Animal is sleeping.");
    }
}

// Subclass (Child) - Inherits from Animal
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking!");
    }
}
