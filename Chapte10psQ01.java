class Circle{
    int radius;
    Circle(int radius){
        this.radius=radius;
        System.out.println("This is a contructor of Circle Class! ");
    }

    public double circleArea(){
        return Math.PI*this.radius*this.radius;
    }

    
}

class Cylinder extends Circle{
    int height;

    Cylinder(int radius,int height){
        super(radius);
        this.height=height;
        System.out.println("This is a constructor of Cylinder Class! ");
    }

    public double cylinderVolume(){
        return Math.PI*this.radius*this.radius*this.height;
    } 
}


public class Chapte10psQ01 {
    public static void main(String[] args) {
        Cylinder c=new Cylinder(5,10);

        System.out.println("Area of Circle: " +c.circleArea());
        System.out.println("Volume of Cylinder: "+ c.cylinderVolume() );

       
    }
    
}
