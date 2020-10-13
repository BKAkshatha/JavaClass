public class Assignment3 {

    public void arithmeticLogicalOperators(int num, int num2, int num3) {
        if (num % 2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        if (num2 == 0) {
            System.out.println("y is zero");
        } else {
            if (num > 0) {
                System.out.println("y is positive");
            } else {
                System.out.println("y is negative");
            }

        }
    }
    public void bitwiseOperators() {
        int number1 = 12, number2 = 25, binaryOr;
        binaryOr = number1 | number2;
        Boolean result1 = binaryOr == 29;
        System.out.println("BinaryOR is : " + binaryOr + " Result True / False after declaring is : " + result1);
    }
}




