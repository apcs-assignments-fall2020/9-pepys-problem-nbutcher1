import java.util.Random;
public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int total = 0;
        int[] arr = new int[6];
        for (int i = 0; i < 10000; i++) {
            arr[0] = (int)(Math.random() * 6) + 1;
            arr[1] = (int)(Math.random() * 6) + 1;
            arr[2] = (int)(Math.random() * 6) + 1;
            arr[3] = (int)(Math.random() * 6) + 1;
            arr[4] = (int)(Math.random() * 6) + 1;
            arr[5] = (int)(Math.random() * 6) + 1;
            for (int j = 0; j < arr.length; j++ ) {
                if (arr[j] == 6) {
                    total += 1;
                    break;
                }
            }
        }
        double num = (double)total/10000.0;
        num *= 100;
        return num;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int total = 0;
        int tote = 0;
        int[] arr = new int[12];
        for (int i = 0; i < 10000; i++) {
            total = 0;
            arr[0] = (int)(Math.random() * 6) + 1;
            arr[1] = (int)(Math.random() * 6) + 1;
            arr[2] = (int)(Math.random() * 6) + 1;
            arr[3] = (int)(Math.random() * 6) + 1;
            arr[4] = (int)(Math.random() * 6) + 1;
            arr[5] = (int)(Math.random() * 6) + 1;
            arr[6] = (int)(Math.random() * 6) + 1;
            arr[7] = (int)(Math.random() * 6) + 1;
            arr[8] = (int)(Math.random() * 6) + 1;
            arr[9] = (int)(Math.random() * 6) + 1;
            arr[10] = (int)(Math.random() * 6) + 1;
            arr[11] = (int)(Math.random() * 6) + 1;
            for (int j = 0; j < arr.length; j++ ) {
                if (arr[j] == 6) {
                    total += 1;
                }
                if (total == 2) {
                    tote +=1;
                    break;
                }
            }
        }
        double num = (double)tote/10000.0;
        num *= 100;
        return num;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
                int total = 0;
        int tote = 0;
        int[] arr = new int[18];
        for (int i = 0; i < 10000; i++) {
            total = 0;
            arr[0] = (int)(Math.random() * 6) + 1;
            arr[1] = (int)(Math.random() * 6) + 1;
            arr[2] = (int)(Math.random() * 6) + 1;
            arr[3] = (int)(Math.random() * 6) + 1;
            arr[4] = (int)(Math.random() * 6) + 1;
            arr[5] = (int)(Math.random() * 6) + 1;
            arr[6] = (int)(Math.random() * 6) + 1;
            arr[7] = (int)(Math.random() * 6) + 1;
            arr[8] = (int)(Math.random() * 6) + 1;
            arr[9] = (int)(Math.random() * 6) + 1;
            arr[10] = (int)(Math.random() * 6) + 1;
            arr[11] = (int)(Math.random() * 6) + 1;
            arr[12] = (int)(Math.random() * 6) + 1;
            arr[13] = (int)(Math.random() * 6) + 1;
            arr[14] = (int)(Math.random() * 6) + 1;
            arr[15] = (int)(Math.random() * 6) + 1;
            arr[16] = (int)(Math.random() * 6) + 1;
            arr[17] = (int)(Math.random() * 6) + 1;
            for (int j = 0; j < arr.length; j++ ) {
                if (arr[j] == 6) {
                    total += 1;
                }
                if (total == 3) {
                    tote +=1;
                    break;
                }
            }
        }
        double num = (double)tote/10000.0;
        num *= 100;
        return num;
    }


    public static void main(String[] args) {
        probabilityOneSix();
    }
}
