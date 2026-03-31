import java.util.Scanner;

public class Binary_to_decimalC {

    public static String convertToBinaryString(int num) {
        String binary = "";

        while (num > 0) {
            binary = (num % 2) + binary;
            num = num / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String result = convertToBinaryString(num);

        System.out.println("Binary String: " + result);
    }
}

