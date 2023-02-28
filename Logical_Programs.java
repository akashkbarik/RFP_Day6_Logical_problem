import java.util.Scanner;

public class Logical_Programs {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Logical_Programs lp = new Logical_Programs();


    }

    //    fibonacci series
    public void fibonacci_series() {
        System.out.println("enter the number of fibonacci series elements to print :");
        int count = sc.nextInt();
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < count; i++) {
            int sum = num2 + num1;
            num1 = num2;
            num2 = sum;
            System.out.println(num1 + " ");
        }
        System.out.println("all elements are : ");
    }

    //      prime number
    public void Prime_Number() {
        System.out.println("this is prime number code\n.....................");
        System.out.print("Enter the number: ");
        int primeNum = sc.nextInt();

        for (int i = 2; i <= primeNum / 2; i++) {
            if (primeNum % i == 0) {
                System.out.print(primeNum + " is not a prime number.");
            } else {
                System.out.print(primeNum + " is a prime number. ");
            }
            break;
        }
    }
//          perfect number
}