class Phone{
    public void message(){
        System.out.println("Messaging...");
    }

    public void ring(){
        System.out.println("Ti Ti Ti ...");
    }
}

class SmartPhone extends Phone{
    public void call(){
        System.out.println("Calling...");
    }

    public void ring(){
        System.out.println("Song is playing as Ringtone...");
    }

}

public class L49DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone ss=new SmartPhone();

        ss.message();
        ss.ring();



        // SmartPhone sp=new SmartPhone();
        // sp.message();
        // sp.ring();
        // sp.call();


        // Phone p=new Phone();
        // p.message();
        // p.ring();

       



       
        
    }
    
}
