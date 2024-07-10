package data2;

public class _1except1 {
        public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int index1 = 10;
        int index2 = 0;
        System.out.println("trying changes..");

        try {
            // Outer try block
            try 
            {
                // Inner try block
                int result = numbers[index1] / numbers[index2];
                System.out.println("Result of division: " + result);
            } 
            catch (ArithmeticException e) 
            {
                System.out.println("Error: Division by zero");
            }
            
            // Simulating another nested try block in the same method
            try {
                String str = null;
                System.out.println("Length of the string: " + str.length());
            } 
            catch (NullPointerException e) {
                System.out.println("Error: Null pointer exception");
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }   
}
}
//When any try block does not have a catch block for a particular exception, then the catch block of the outer (parent) try block are checked for that exception, and if it matches, the catch block of outer try block is executed.