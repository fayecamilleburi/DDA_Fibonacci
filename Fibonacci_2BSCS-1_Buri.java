import java.util.*;

public class Fibonacci_2BSCS-1_Buri {

    //main method
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //instantiate the programmer's name
        String name = "Faye Camille Buri";

        //instantiate a scanner to accept input
        Scanner read = new Scanner(System.in);

        while(true) {
            System.out.print("What method would you choose to solve the sequence?\n" +
                               "a. Non-recursive\n" +
                               "b. Recursive\n" +
                               "c. Exit (" + name + ")\n\n" +
                               "Choose an option: ");
            char opt = read.next().charAt(0);

            switch(opt) {
                case 'a': //non-recursive option
                    System.out.print("\nEnter n: ");
                    int n1 = read.nextInt();
                    System.out.println("\nNon-recursive Fibonacci Sequence:");
                    nonRecursiveFibonacci(n1);
                    System.out.println();
                    break;
                case 'b': //recursive option
                    System.out.print("\nEnter n: ");
                    int n2 = read.nextInt();
                    System.out.println("\nRecursive Fibonacci Sequence:");
                    for(int i=0; i < n2; i++) {
                        System.out.print(recursiveFibonacci(i) + " ");
                    }
                    System.out.println("\n");
                    break;
                case 'c': //exit program option
                    System.out.println("Program Exit. Programmer: " + name);
                    System.exit(0);
                    break;
                default: //for invalid options
                    System.out.println("\nInvalid option. Please try again.\n");
            }
        }
    }

    //non-recursive method
    public static void nonRecursiveFibonacci(int a) {
        int b = 0;
        int c = 1;

        for(int i=0; i < a; i++) {
            System.out.print(b + " ");
            int sum = b + c;
            b = c;
            c = sum;
        }
        System.out.println();
    }

    //recursive method
    public static int recursiveFibonacci(int a) {
        if (a <= 1)
            return a;

        int fib1 = recursiveFibonacci(a-1);
        int fib2 = recursiveFibonacci(a-2);

        return fib1 + fib2;
    }
}
