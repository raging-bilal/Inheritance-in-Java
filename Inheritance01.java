class Base{
    int x;

    public void setx(int x){
        this.x=x;
    }

    public int getx(){
        return x;
    }

    public void printx(){
        System.out.println("I am a method of Base Class!");
    }
    

}

class Derived extends Base{
    int y;

    public void sety(int y){
        this.y=y;
    }

    public int gety(){
        return y;
    }

    public void printy(){
        System.out.println("I am a method of Derived Class!");
    }


}

public class Inheritance01{
    public static void main(String[] args) {
        Derived d=new Derived();

        d.setx(100);
        d.sety(200);

        System.out.println(d.getx());
        System.out.println(d.gety());


        d.printx();
        d.printy();
    }
}