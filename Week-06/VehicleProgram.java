// Vehicle Program

public class VehicleProgram {
    public static void main(String[] args) {
        TwoWheeler twoWheeler1 = new TwoWheeler();
        twoWheeler1.input(1, 123, "blue");
        twoWheeler1.input(1000, 2000);
        twoWheeler1.getConsumption(100);
        twoWheeler1.displayConsumption();
        twoWheeler1.maintanance();
        twoWheeler1.average();

        System.out.println("\n");

        FourWheeler fourWheeler1 = new FourWheeler();
        fourWheeler1.input(2, 456, "red");
        fourWheeler1.input(2000, 3000);
        fourWheeler1.getConsumption(200);
        fourWheeler1.displayConsumption();
        fourWheeler1.maintanance();
        fourWheeler1.average();
    }
}

class Vehicle {
    int vehicleNumber;
    int insuranceNumber;
    String color;
    int fuel;

    void input(int vehicleNumber, int insuranceNumber, String color) {
        this.vehicleNumber = vehicleNumber;
        this.insuranceNumber = insuranceNumber;
        this.color = color;
    }

    void getConsumption(int fuel) {
        this.fuel = fuel;
    }

    void displayConsumption() {
        System.out.println("Fuel Consumption: " + fuel);
    }
}

class TwoWheeler extends Vehicle {
    int maintanance;
    int average;

    void input(int maintanance, int average) {
        this.maintanance = maintanance;
        this.average = average;
    }

    void maintanance() {
        System.out.println("TwoWheeler Maintainance: " + maintanance);
    }

    void average() {
        System.out.println("TwoWheeler Average: " + average);
    }
}

class FourWheeler extends Vehicle {
    int maintanance;
    int average;

    void input(int maintanance, int average) {
        this.maintanance = maintanance;
        this.average = average;
    }

    void maintanance() {
        System.out.println("FourWheeler Maintainance: " + maintanance);
    }

    void average() {
        System.out.println("FourWheeler Average: " + average);
    }
}