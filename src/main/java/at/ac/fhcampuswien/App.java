package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
        // input your solution here
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __           ");
        System.out.println(" _(\\    |@@|          ");
        System.out.println("(__/\\__ \\--/ __     ");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\ ");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/ ");
        System.out.println("      _)(  )(_ ");
        System.out.println("     `---''---` ");

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
        System.out.println();
       Scanner scan1 = new Scanner(System.in);
       number1 = scan1.nextInt();


        System.out.println();
        Scanner scan2 = new Scanner(System.in);
        number2 = scan2.nextInt();

        System.out.println(number1 + number2);





    }


    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
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