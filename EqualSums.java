import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int f = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        for (int i = f; i <= s; i++) {

            int leftSum = 0;
            int midSum = 0;
            int rightSum = 0;

            for (int k = 0; k <= Integer.toString(i).length() - 1; k++) {

                int num = Integer.toString(i).charAt(k) - 48;

                if (k <= 1) leftSum += num;
                else if (k >= 3) rightSum += num;
                else midSum += num;

            }


            if (leftSum == rightSum || ( Math.min(leftSum, rightSum) + midSum == Math.max(leftSum,rightSum))) {
                System.out.printf("%d ", i);
            }
        }
    }
}