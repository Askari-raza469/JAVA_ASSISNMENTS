import java.util.Scanner;
public class Pi_To_radian_QUES {
    
    public static void main(String[] args) {
    // double r = Math.toRadians(30); 
        // System.out.println(r);
        // double r2 = 30*Math.PI/180;
        // System.out.println(r2);

    //     write a progam in java that takes lenght & breath(in inches) of the place that is to be carpeted,the price of carpet in square foot last input will be discount percentage.your program should print the price of carpet for the given area,before discount and after discount both values.
    // 
    Scanner sc = new Scanner(System.in);

        // Input length and breadth in inches
        System.out.print("Enter length of the room (in inches): ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of the room (in inches): ");
        double breadth = sc.nextDouble();

        // Input price per square foot
        System.out.print("Enter price of carpet per square foot: ");
        double pricePerSqFt = sc.nextDouble();

        // Input discount percentage
        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        // Calculate area in square feet
        double areaSqFt = (length * breadth) / 144;

        // Price before discount
        double priceBeforeDiscount = areaSqFt * pricePerSqFt;

        // Discount amount
        double discountAmount = (discountPercent / 100) * priceBeforeDiscount;

        // Price after discount
        double priceAfterDiscount = priceBeforeDiscount - discountAmount;

        // Output results
        System.out.println("\nArea to be carpeted: " + areaSqFt + " sq ft");
        System.out.println("Price before discount: " + priceBeforeDiscount);
        System.out.println("Price after discount: " + priceAfterDiscount);

        sc.close(); 
    }
}
