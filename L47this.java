class Class{
    int a;

    Class(int a){
        this.a=a;
    }

    public int geta(){
        return a;
    }

    
}

public class L47this{
    public static void main(String[] args) {
        Class c=new Class(114);
        

        System.out.println(c.geta());
    }
}