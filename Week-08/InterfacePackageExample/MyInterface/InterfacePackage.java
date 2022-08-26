package MyInterface;

public class InterfacePackage {

  public interface CreatedInterface {
    public void show();
  }

  public class CreatedClass implements CreatedInterface {
    public void show() {
      System.out.println("Interface Package");
    }
  }
}
