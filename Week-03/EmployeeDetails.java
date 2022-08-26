import java.util.*;

/**
 * EmployeeDetails
 */
public class EmployeeDetails {

    int id;
    String name;
    int age;
    String gender;
    String designation;
    int salary;
    String address;

    public void input() {

        // creating scanner object
        Scanner scan = new Scanner(System.in);

        System.out.print("Employee ID: ");
        id = scan.nextInt();

        System.out.print("Employee Name: ");
        name = scan.next();

        System.out.print("Employee Age: ");
        age = scan.nextInt();

        System.out.print("Employee Gender: ");
        gender = scan.next();

        System.out.print("Employee Designation: ");
        designation = scan.next();

        System.out.print("Employee Salary: ");
        salary = scan.nextInt();

        System.out.print("Employee Address: ");
        address = scan.next();

        scan.close();

    }

    public void output() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);

    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner scan = new Scanner(System.in);

        // Read number of employees => n
        System.out.print("Number of Employees: ");
        int n = scan.nextInt();

        // creating employees array of object
        EmployeeDetails employees[] = new EmployeeDetails[n];

        // Read employee details
        for (int i = 0; i < n; i++) {
            // creating instance for every employee
            employees[i] = new EmployeeDetails();

            // System.out.format("Employee %d ", i);

            // reading employee details using read method
            employees[i].input();

        }

        // Read employee id to get details
        System.out.println("Enter ID to get Details:");
        int inputId = 1; // scan.nextInt();

        // Print Employee Details
        int isEmployeeFound = 0;
        for (int i = 0; i < n; i++) {
            if (employees[i].id == inputId) {

                System.out.format("--------     Employee%d Details       ------------\n\n", inputId);
                employees[i].output();

                isEmployeeFound = 1; // employee found
            }
        }

        if (isEmployeeFound == 0) // employee not found
            System.out.println("Employee ID not found!");

        scan.close();
    }
}

// 1
// 1
// aa
// 1
// bb
// cc
// 2
// dd