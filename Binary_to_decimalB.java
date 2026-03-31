import java.util.Scanner;

public class Binary_to_decimalB {

    public static int[] convertToBinaryArray(int num) {
        int temp = num;
        int count = 0;

        // Count number of bits
        while (temp > 0) {
            temp = temp / 2;
            count++;
        }

        int[] binaryArray = new int[count];

        // Fill array from end
        for (int i = count - 1; i >= 0; i--) {
            binaryArray[i] = num % 2;
            num = num / 2;
        }

        return binaryArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int[] result = convertToBinaryArray(num);

        System.out.print("Binary Array: ");
        for (int bit : result) {
            System.out.print(bit);
        }
    }
}

