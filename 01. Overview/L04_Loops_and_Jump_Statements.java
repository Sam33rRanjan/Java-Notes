class L04_Loops_and_Jump_Statements {
    public static void main(String[] args) {
        // While loop
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("The value of i is " + i);

        // Do-While loop
        int j = 0;
        do {
            System.out.println(j);
            j+=2;
        } while (j <= 10);
        System.out.println("The value of j is " + j);

        // For loop
        for (int k = 1; k <= 10; k++) {
            System.out.println(k);
        }

        // Break statement
        for (int l = 1; l <= 10; l++) {
            if (l == 5) {
                break;
            }
            System.out.println(l);
        }

        // Continue statement
        for (int m = 1; m <= 10; m++) {
            if (m == 5) {
                continue;
            }
            System.out.println(m);
        }

        // Reverse a number
        int n = 1234;
        int rev = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("The reverse of the number is " + rev);

        // Palindrome number
        int num = 12321;
        int temp = num;
        int revNum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            revNum = revNum * 10 + digit;
            temp = temp / 10;
        }
        if (num == revNum) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }
}