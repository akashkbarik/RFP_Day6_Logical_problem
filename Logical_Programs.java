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
    public void Perfect_number() {
        System.out.println("this perfect number code\n.......................");
        int sum = 0;
        System.out.print("Enter the number: ");
        int perfNum = sc.nextInt();
        for (int i = 1; i <= perfNum / 2; i++) {
            if (perfNum % i == 0) {
                sum += i;
            }
        }
        if (sum == perfNum) {
            System.out.println(perfNum + " is a perfect number.");
        } else {
            System.out.println(perfNum + " is not a perfect number.");
        }
    }

    //      reverse number
    public void Reverse_Number() {
        System.out.println("this is reverse number code\n...............................");
        System.out.println("Enter the number to be reversed :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of the given number is : " + reverse);

    }

    //    Stopwatch code
    public void StopWatch() {
        System.out.println("this is stopwatch code\n............................");
        long start = 0, end = 0;
        System.out.println("enter Enter button to start the time");
        String input = sc.nextLine(); // stores user input

        if (input.isEmpty()) { // enter key pressed
            start = System.currentTimeMillis();
        }

        input = sc.nextLine();
        if (input.isEmpty()) { // enter key pressed
            end = System.currentTimeMillis();
        }
        System.out.println("Diffrence between two clicks is: " + ((int) (end - start) / 1000) + " seconds.");
    }
}


