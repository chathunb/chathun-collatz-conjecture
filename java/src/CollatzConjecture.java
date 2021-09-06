import java.util.ArrayList;
import java.util.List;

/**
 * Hero is the main entity we'll be using to . . .
 * 
 * 
 * @author Chathuranga Bandara
 * @email chathunbandara@gmail.com
 */

public class CollatzConjecture {

    public static void main(String args[]) {
        // Run method with number to make collatzConjecture
        // collatzConjectureTrigger(27);
        collatzConjectureChart(3);
    }

    public static void collatzConjectureTrigger(int value) {
        int initValue = value;
        int result = 0;
        int loopCount = 1;

        for (;;) { // Start infinity loop til result equal to 1

            if (initValue % 2 == 1) {
                // This is Odd Number
                result = (initValue * 3) + 1;

            } else if (initValue % 2 == 0) {
                // This is Even Number
                result = initValue / 2;
            }

            initValue = result;

            System.out.println("Result " + result + " Cycle " + loopCount + " ");

            if (result == 1) {
                System.out.println("Loop Detected Full Cycle Length " + loopCount);
                break;
            }
            loopCount++;
        }
    }

    public static void collatzConjectureChart(int value) {
        int initValue = value;
        int result = 0;
        int loopCount = 1;
        ArrayList<Integer> list = new ArrayList<>();

        for (;;) { // Start infinity loop til result equal to 1

            if (initValue % 2 == 1) {
                // This is Odd Number
                result = (initValue * 3) + 1;

            } else if (initValue % 2 == 0) {
                // This is Even Number
                result = initValue / 2;
            }

            initValue = result;

            for (int i = 0; i < result; i++) {
                System.out.print("*");
            }
            System.out.print("[" + result + "] ");
            System.out.println(" ");

            list.add(result);
            if (result == 1) {
                System.out.println("Loop Detected Full Cycle Length " + loopCount);
                System.out.println(" ");
                break;
            }
            loopCount++;
        }

        // Draw Bar Chart

        int len = list.size();
        int max = 0;

        for (int i = 0; i < len; i++) // find max of array
        {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        char[][] dis1 = new char[len][max];

        for (int j = 0; j < len; j++) // store the array in horizontal order
        {
            for (int i = 0; i < max - list.get(j); i++)
                dis1[j][i] = ' ';

            for (int k = max - list.get(j); k < max; k++) {
                dis1[j][k] = '*';
            }

        }

        for (int i = 0; i < max; i++) // print the array in transpose order
        {

            for (int j = 0; j < len; j++) {

                System.out.print(dis1[j][i] + " ");

            }

            System.out.println();
        }
    }
}