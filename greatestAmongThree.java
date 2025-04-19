import java.util.Scanner;

public class greatestAmongThree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.print("Entre 3rd number:");
        int c = sc.nextInt();
        int d = (a>b && a>c)?a:(b>c?b:c);
        System.out.print("Greatest number is "+d);
    }
}
