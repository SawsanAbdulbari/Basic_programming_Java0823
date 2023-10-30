public static void calculate(int num1, int num2, String operation) {
        int result = 0;
        String resultString = "The result is ";

        if (operation.equals("sum")) {
            result = num1 + num2;
        } else if (operation.equals("subtraction")) {
            result = num1 - num2;
        } else if (operation.equals("multiplication")) {
            result = num1 * num2;
        } else {
            System.out.println("Invalid operation.");
            return; 
        }

        System.out.println(resultString + result + ".");
    }