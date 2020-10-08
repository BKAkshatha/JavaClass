public class Assignment2 {

    public void arithmeticOperators(int a1, int a2) {
        int addition = a1 + a2;
        int substraction = a1 - a2;
        int division = a1 / a2;
        int remainder = a1 % a2;
        int multiplication = a1 * a2;

        System.out.println("Addition of two numbers : " + addition);
        System.out.println("Substraction of two numbers: " + substraction);
        System.out.println("Division of two numbers: " + division);
        System.out.println("Remainder of two numbers: " + remainder);
        System.out.println("Multiplication of two numbers: " + multiplication);
    }

    public void incrementOperators(int b1) {
        System.out.println("Value before incrementing: " + b1);
        int preIncrement = ++b1;
        int postIncrement = b1++;
        System.out.println("Value after Preincrement: " + preIncrement);
        System.out.println("Value after Postincrement: " + postIncrement);
    }

    public void table(int c1) {
        System.out.println(c1 + " X " + 1 + " = " + c1 * 1 );
        System.out.println(c1 + " X " + 2 + " = " + c1 * 2 );
        System.out.println(c1 + " X " + 3 + " = " + c1 * 3 );
        System.out.println(c1 + " X " + 4 + " = " + c1 * 4 );
        System.out.println(c1 + " X " + 5 + " = " + c1 * 5 );
        System.out.println(c1 + " X " + 6 + " = " + c1 * 6 );
        System.out.println(c1 + " X " + 7 + " = " + c1 * 7 );
        System.out.println(c1 + " X " + 8 + " = " + c1 * 8 );
        System.out.println(c1 + " X " + 9 + " = " + c1 * 9 );
        System.out.println(c1 + " X " + 10 + " = " + c1 * 10 );
    }
}

