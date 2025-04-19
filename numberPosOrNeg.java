import java.util.Scanner;

public class numberPosOrNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n > 0)
            System.out.println("Positive number");
        else if (n < 0)
            System.out.println("Negative Number");
        else
            System.out.println("Number is zero");

    }

}
