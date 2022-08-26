package Companies;

public class Apple {
    public void appleMethod() {
        System.out.println("\nApple Package");

        Mac macObj = new Mac();
        macObj.mac();

        IPhone iPhoneObj = new IPhone();
        iPhoneObj.iPhone();
    }
}

class Mac{
    public void mac(){
        System.out.println("Mac Class");
    }
}

class IPhone{
    public void iPhone(){
        System.out.println("iPhone Class");
    }
}