public class Polymorphism {
    public static void main(String[] args) {
        
        Parent parent=new Parent();
        Child child=new Child();
        
        // Dynamic dispatch
        Parent polymorphicObj = new Child();

        // Method Overloading (compile-time)
        parent.func();
        parent.func(10);

        // Method Overriding (runtime)
        child.func(35);

        // Polymorphism in action
        polymorphicObj.func(69);
    }
}

//Dynamic Dispatch
class Parent{
    // Overloaded method (compile-time polymorphism)
    public void func(){
        System.out.println("Parent.func()");
    }

    // Overloaded method (same name, different parameter)
    public void  func(int a){
        System.out.println("Parent.func(): "+a);
    }
}

//Child class
class Child extends Parent{
    // Overrides Parent.func(int) (runtime polymorphism)
    @Override
    public void func(int a){
        System.out.println("child.func(): "+a);
    }
}
