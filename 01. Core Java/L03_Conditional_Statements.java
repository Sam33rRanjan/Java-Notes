class L03_Conditional_Statements {
    public static void main(String[] args) {
        int age = 18;

        //if
        if (age >= 18) {
            System.out.println("Eligible to vote!");
        }

        // if-else
        if (age >= 18) {
            System.out.println("Eligible to vote!");
        } else {
            System.out.println("Not eligible to vote!");
        }

        // if-else-if
        if (age > 18) {
            System.out.println("Eligible to vote!");
        } else if (age == 18) {
            System.out.println("Will be eligible to vote next year!");
        } else {
            System.out.println("Not eligible to vote!");
        }

        // Nested if-else
        if(age>=18)
        {
            if(age>=60)
            {
                System.out.println("Senior Citizen");
            }
            else
            {
                System.out.println("Adult");
            }
        }

        // switch-case
        int day = 5;
        switch (day) {
            case 1:
                System.out.print("Weekend ");
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                // break;
            case 6:
                System.out.println("Friday hai pencho!");
                break;
            case 7:
                System.out.print("Weekend ");
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}