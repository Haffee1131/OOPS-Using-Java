// ROLLING PAIR OF DICE: CALCULATING SUCCESSFUL ATTEMPTS(SAME VALUE FOR DICE1 AND DICE2)

import java.util.*;

public class Dice {
    public static void main(String[] args) throws Exception {

        int turns = 10;

        Random random = new Random();

        int dice1, dice2, succesfulAttempts = 0;
        for (int i = 0; i < turns; i++) {

            System.out.println("Dice1 Rolling...");
            dice1 = random.nextInt(7);
            System.out.println("Dice2 Rolling...");
            Thread.sleep(10000);
            dice2 = random.nextInt(7);

            System.out.format("\n(%d, %d)\n\n", dice1, dice2);

            if (dice1 == dice2) {
                succesfulAttempts += 1;
                System.out.format("succesful Attempt %d\n\n", succesfulAttempts);
            }
        }

        System.out.println("Total Succesful Attempts: " + succesfulAttempts);
    }
}
