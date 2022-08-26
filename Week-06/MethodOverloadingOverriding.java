//  MethodOverloading And Method Overriding example program

class MethodOverloadingOverriding {
    public static void main(String[] args) {
        Overloading methodOverloading = new Overloading();

        methodOverloading.add(10, 20);
        methodOverloading.add(10, 20, 30);
        methodOverloading.add(10.5f, 20);
        methodOverloading.add(10, 20.5f);

        Overriding methodOverriding = new Overriding();

        methodOverriding.add(1000, 2000, 3000, 4000);

    }
}

class Overloading {
    int sum;

    void add(int a, int b) {
        sum = a + b;
        System.out.println("sum: " + sum);
    }

    // number of arguments
    void add(int a, int b, int c) {
        sum = a + b + c;
        System.out.println("sum: " + sum);
    }

    // type of arguments
    void add(float a, int b) {
        float sum = a + b;
        System.out.println("sum: " + sum);
    }

    // sequence of arguments
    void add(int b, float a) {
        float sum = a + b;
        System.out.println("sum: " + sum);
    }

}

class Overriding extends Overloading {
    void add(int a, int b, int c, int d) {
        sum = a + b + c + d;
        System.out.println("Overriding sum: " + sum);
    }
}
