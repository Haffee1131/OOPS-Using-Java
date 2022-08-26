// CALL BY VALUE AND CALL BY OBJECT EXAMPLE PROGRAM

public class CallbyValueAndObject {
    public static void main(String args[]) {
        // call by value
        int i = 11;
        System.out.println("\nCALL BY VALUE\n");
        System.out.println("Before change method:" + i);
        changeValue(i);
        System.out.println("After change method:" + i);

        // callbyobject
        System.out.println("\nCALL BY OBJECT\n");
        IntegerClass j = new IntegerClass();
        j.value = 11;
        System.out.println("Before change method:" + j.value);
        changeObject(j);
        System.out.println("After change method:" + j.value);
    }

    private static void changeObject(IntegerClass j) {
        j.value = 31;
    }

    // method for call by value
    private static void changeValue(int i) {
        i = 31;
    }
}

class IntegerClass {
    int value;
}