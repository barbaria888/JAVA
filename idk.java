import java.util.Scanner;

class sc {
    public static void main(String args[]) {
        // scanner object creation
        Scanner mynew = new Scanner(System.in);

        // entering the data into the mynew object
        System.out.println("Enter the number");
        int n = mynew.nextInt();

        // printing by retrieving the data from mynew class
        if (n == 5) {
            designs.starStraight(n);
        }

        if (n == 10) {
            designs.starOpp(n);
        }

        if (n == 15) {
            designs.pyramid(n);
        }

        mynew.close();
    }
}

class designs {
    static void starStraight(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    static void starOpp(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    static void pyramid(int n) {
        /*
            *
           ***
          *****
         *******
        *********
        */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}
