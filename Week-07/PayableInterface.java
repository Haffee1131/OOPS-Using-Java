
public class PayableInterface {
  public static void main(String[] args) {
    Invoice invoice = new Invoice(1000);
    invoice.getAmount();

    Employee employee = new Employee(2000);
    employee.getAmount();
  }
}

interface Payable {
  void getAmount();
}

class Invoice implements Payable {
  int invoiceAmount;

  Invoice(int invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }

  public void getAmount() {

    System.out.println("Amount Paid to Invoice: " + invoiceAmount);
  }
}

class Employee implements Payable {
  int employeeAmount;

  Employee(int employeeAmount) {
    this.employeeAmount = employeeAmount;
  }

  public void getAmount() {

    System.out.println("Amount Paid to Employee: " + employeeAmount);
  }
}
