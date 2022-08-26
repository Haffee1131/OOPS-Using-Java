// COMMAND LINE ARGUMENTS PROGRAM

public class CommandLineArguments {
    public static void main(String args[]) {

        // Normal for loop
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        System.out.println("\n");

        // Enhanced for loop
        for (String argument : args) {
            System.out.println(argument);
        }
    }
}