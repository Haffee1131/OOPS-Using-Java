import Department.Departments;

import java.util.*;

public class DepartmentDetails {
    public static void main(String[] args) {
        // Departments departments = new Departments();
        // Departments.CSE cseDepartment = new Departments.CSE(); // cse must be static
        // eceDepartment.cse();

        Departments departments = new Departments();

        Departments.CSE cseDepartment = departments.new CSE();
        cseDepartment.cse();
        Departments.ECE eceDepartment = departments.new ECE();
        eceDepartment.ece();
        Departments.CE ceDepartment = departments.new CE();
        ceDepartment.ce();
        Departments.ME meDepartment = departments.new ME();
        meDepartment.me();

    }
}
