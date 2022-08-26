package Companies;

public class Google {
    public void googleMethod() {
        System.out.println("\nGoogle Package");

        Gmail gmailObj = new Gmail();
        gmailObj.gmail();

        Maps mapsObj = new Maps();
        mapsObj.maps();
    }
}

class Gmail{
    public void gmail(){
        System.out.println("Gmail Class");
    }
}

class Maps{
    public void maps(){
        System.out.println("Maps Class");
    }
}