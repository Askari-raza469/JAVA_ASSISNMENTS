import java.util.Scanner;
public class Voucher_QUES {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int voucherAmount =5000;
        while(true){
            System.out.println("Current vocher balanc" + voucherAmount );
            System.out.println("enter item price ");

            int itemprice =sc.nextInt();
            if(itemprice<=voucherAmount ){
                voucherAmount = voucherAmount-itemprice;
                System.out.println("item purchased sucessfully");
                System.out.println("reamining baclance "+voucherAmount);
            }
            else{
                System.out.println("not allowed");
            }
        }
    }
}
