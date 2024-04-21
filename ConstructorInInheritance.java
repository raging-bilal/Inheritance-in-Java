class Base1{
    Base1(){
        System.out.println("I am a constructor of Base1 Class!");
    }
}


class Derived1 extends Base1{
    Derived1(){
        System.out.println(" I am a constructor of Derived Class! ");
    }
}


public class ConstructorInInheritance {
    public static void main(String[] args) {

        Derived1 d1=new Derived1();
        
    }
    
}
