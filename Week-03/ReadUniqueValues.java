import java.util.Scanner;

public class ReadUniqueValues {
    public static void main(String[] args) {

        // creating scanner object
        Scanner scan = new Scanner(System.in);

        int uniqueArray[] = new int[5];

        int count = 0;
        while (count < 5) {
            System.out.print("Input Number(10 - 100): ");
            int value = scan.nextInt();
            if (value < 10 || value > 100) {
                System.out.println("Enter Number in range!\n");
                continue;
            }
            int duplicateFound = 0;

            for (int i = 0; i < count; i++) {
                if (uniqueArray[i] == value) {
                    duplicateFound = 1;
                    break;
                }
            }
            if (!duplicateFound) {
                uniqueArray[count] = value;
                count += 1;

                for (int i = 0; i < count; i++) {
                    System.out.print(uniqueArray[i] + ", ");
                }
                System.out.println();

            }
        }
        scan.close();
    }
}
