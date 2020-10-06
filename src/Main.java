public class Main {

    public static void main(String[] args) {
        dataTypesMethod();
        int variable5 = variableAssignmentMethod(6);
        System.out.println("Value of int variable5 in mainMethod is: " + variable5);
    }

    static void dataTypesMethod() {
        String variable1 = "staticMethodVariable";
        int variable2 = 10;
        double variable3 = 15.01;

        System.out.println("Value of String variable1 in dataTypesMethod is: " + variable1);
        System.out.println("Value of int variable2 in dataTypesMethod is: " + variable2);
        System.out.println("Value of double variable3 in dataTypesMethod is: " + variable3);

    }

    static int variableAssignmentMethod(int variable4) {
        System.out.println("Value of int variable4 in variableAssignmentMethod is: " + variable4);
        return variable4 + 1;
    }
}
