import java.util.Scanner;

/**
 * power
 */
public class power {

    public static int Powerno(int x, int n){

        int product = 1;
        for (int i=1; i<=n; i++){
            product = product * x;
        }

        return product;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");int x = sc.nextInt();

        System.out.print("Enter number power = ");int n = sc.nextInt();

        System.out.println(x + " number which power " + n + " is equal to = " + Powerno(x, n));

        
    }
}