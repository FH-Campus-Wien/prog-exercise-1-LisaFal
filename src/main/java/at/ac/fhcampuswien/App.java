package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
        // input your solution here
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                        "         __" + System.lineSeparator() +
                        " _(\\    |@@|" + System.lineSeparator() +
                        "(__/\\__ \\--/ __" + System.lineSeparator() +
                        "   \\___|----|  |   __" + System.lineSeparator() +
                        "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                        "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                        "      (--/\\--)    \\__/" + System.lineSeparator() +
                        "      _)(  )(_" + System.lineSeparator() +
                        "     `---''---`");

        // input your solution here
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char grade = 'Z';
        int grade2 = grade;

        int number = 0xface;
        int numb = 012;

        long size = 80L;
        int size2 = (int)size; //cast

        float n = 44e-1f;
        int n0 = (int)n;

        double n1 = 8.88e1;
        int n11 = (int)n1;

        double n2 = 5.5f;
        int n22 = (int)n2;

        double n3 = 99.9;
        int n33 = (int)n3;

        int sum = grade2 + number + numb + size2 + n0 + n11 + n22 + n33;

        System.out.println(sum);






    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
       int number1;
       int number2;
       Scanner scan1 = new Scanner(System.in);
       number1 = scan1.nextInt();
       number2 = scan1.nextInt();

       System.out.println(number1 + number2);



    }


    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int x = 9;
        int y = 4;
        Scanner scan1 = new Scanner(System.in);

        System.out.print("Before Swap:" + System.lineSeparator() + "x: ");
        x = scan1.nextInt();
        System.out.print("y: ");
        y = scan1.nextInt();

        x = x + y; //x=13
        y = y - x; //y=-9
        x = y + x; //x=4
        y = -y; //y=9

        System.out.println("After Swap:" + System.lineSeparator() + "x: " + x
                 + System.lineSeparator() + "y: " + y);



    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here

        int n1;
        int n2;

        System.out.print("n1: ");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();

        System.out.print("n2: ");
        n2 = scan.nextInt();

        if (n1 < n2) {
            System.out.println("n2 > n1"); }

        if (n1 > n2) {
            System.out.println("n1 > n2"); }

        if (n1 == n2) {
            System.out.println("n1 == n2"); }


        }



    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        int revenue;

        System.out.print("Enter annual Revenue: ");
        Scanner scanr = new Scanner(System.in);
        revenue = scanr.nextInt();

        if (revenue < 0 || revenue >= 100000) {
            System.out.println("Invalid Revenue");
        }
        if (revenue >= 0 && revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        }
        if (revenue >= 20000 && revenue < 50000) {
            System.out.println("Average Sales Revenue");
        }
        if (revenue >= 50000 && revenue < 80000){
            System.out.println("Good Sales Revenue");
        }
        if (revenue >= 80000 && revenue < 100000){
            System.out.println("Excellent Sales Revenue");
        }


    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here

        int commclass;
        double rate;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        commclass = scanner.nextInt();

        switch(commclass) {
            case 1: rate = 0.01;
            break;


            case 2: rate = 0.02;
            break;


            case 3: rate = 0.03;
            break;


            case 4: rate = 0.04;
            break;


            default: rate = 0.00;
        }
        System.out.println("Your Commission Rate was set to " + rate);



    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        int year;
        System.out.print("Year: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leapyear");
        }

        else {
            System.out.println("Not a Leapyear");
        }




    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here

        int numb;
        int numb2;
        int numb3;
        int numb4;
        int numb5;


        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        numb = scan.nextInt();

        numb2 = numb / 100;
        numb3 = numb % 100;
        numb4 = numb3 / 10;
        numb5 = numb3 % 10;

        int numb6 = numb5*100;
        int numb7 = numb4*10;
        int numb8 = numb2;

        int sum = numb6 + numb7 + numb8;

        System.out.println(sum);







    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}