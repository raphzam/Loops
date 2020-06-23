import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;


//        PRINT NUMBERS 1 - 10

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();               //linebreak
        System.out.println();               //linebreak




//        PRINT NUMBERS 1 - 10 BACKWARDS
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();               //linebreak
        System.out.println();               //linebreak




//        PRINT ODD NUMBERS FROM 1 - 20
        for (int i = 1; i < 20; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();               //linebreak
        System.out.println();               //linebreak




//        PRINT EVEN NUMBERS FROM 1 - 20
        for (int i = 2; i <= 20; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();               //linebreak
        System.out.println();               //linebreak




//        PRINT TO 1 FROM USER ENTERED VALUE
        System.out.println("Enter a number");
        userNumber = input.nextInt();
        if (userNumber > 1){
            for (int i = userNumber; i >= 1; i--) {
                System.out.print(i + " ");
            }
        } else if (userNumber < 1){
            for (int i = userNumber; i <= 1; i++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();               //linebreak
        System.out.println();               //linebreak




//        SUM ALL VALUES FROM 1 - 10

        int sum = 0;
        for (int i = 1; i <=10; i++) {
            sum+=i;
        }
        System.out.println("The sum of numbers 1 - 10: " + sum);
        System.out.println();               //linebreak
        System.out.println();               //linebreak




//        SUM OF ALL NUMBERS FROM USER SUBMITTED TO 1

        System.out.println("Enter a number");
        userNumber = input.nextInt();
        if (userNumber > 1){
            for (int i = userNumber; i >= 1; i--) {
                sum+=i;

            }
        } else if (userNumber < 1){
            for (int i = userNumber; i <= 1; i++) {
                sum+=i;

            }
        }
        System.out.printf("The sum of all the numbers from %d to 1 is " + sum, userNumber);
        System.out.println();               //linebreak
        System.out.println();               //linebreak


//        LOOPS TO PRINT GRIDS
//        i)

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();               //linebreak
        System.out.println();               //linebreak

//        ii)

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();               //linebreak
        System.out.println();               //linebreak

//        iii)
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j+i <6){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

//        FACTORIAL OF A NUMBER

        int factorial = 1;
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        for (int i = num; i > 1; i--){
            factorial *= i;
        }
        System.out.printf("The factorial of %d is %d\n", num, factorial);





    }
}
