public class Main {

    public static void main(String[] args) {
        // Assignment1 dated Oct 5 2020
        System.out.println("*****************************Assignment 1 ********************************");
        Assignment1 assignment1 = new Assignment1();
        assignment1.dataTypesMethod();
        int variable5 = Assignment1.variableAssignmentMethod(6);
        System.out.println("Value of int variable5 in mainMethod is: " + variable5);
        Assignment1.characterAssignment();

        // Assignment2 dated Oct 7 2020
        System.out.println("*****************************Assignment 2 Part 1********************************");
        Assignment2 assignment2 = new Assignment2();
        assignment2.arithmeticOperators(5, 7);
        assignment2.incrementOperators(3);
        System.out.println("*****************************Assignment 2 Part 2********************************");
        assignment2.table(2);

        // Assignment dated Oct 9 2020
        System.out.println("*****************************Assignment 3********************************");
        Assignment3 assignment3 = new Assignment3();
        assignment3.arithmeticLogicalOperators(3, 4, 6);
        assignment3.bitwiseOperators();

    }


}
