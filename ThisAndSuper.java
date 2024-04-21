class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+ this.age);
            
    }
}

class GoodStudent extends Student{
    int marks;

    GoodStudent(String name, int age, int marks){
       
        super(name,age);
        this.marks=marks;
        System.out.println("Marks: " + this.marks);

    }
}

public class ThisAndSuper{
    public static void main(String[] args) {
        GoodStudent gs=new GoodStudent("Khushnood",23,100);
    }
}
    


