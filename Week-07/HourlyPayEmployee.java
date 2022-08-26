public class HourlyPayEmployee {
  public static void main(String[] args) {
    HourlyEmployee hourlyEmployee = new HourlyEmployee(10, 100);
    hourlyEmployee.getAmount();

    WeeklyEmployee weeklyEmployee = new WeeklyEmployee(7, 1000);
    weeklyEmployee.getAmount();
  }
}

abstract class Employee {
  abstract void getAmount();
}

class HourlyEmployee {
  int noOfHours;
  int hourlyPay;

  HourlyEmployee(int noOfHours, int hourlyPay) {
    this.noOfHours = noOfHours;
    this.hourlyPay = hourlyPay;
  }

  void getAmount() {
    System.out.println("Hourly Employee Total Amount: " + noOfHours * hourlyPay);
  }
}

class WeeklyEmployee {
  int noOfWeeks;
  int weeklyPay;

  WeeklyEmployee(int noOfWeeks, int weeklyPay) {
    this.noOfWeeks = noOfWeeks;
    this.weeklyPay = weeklyPay;
  }

  void getAmount() {
    System.out.println("Weekly Employee Total Amount: " + noOfWeeks * weeklyPay);
  }
}