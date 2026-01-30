public class MathDemo {
    public static void main(String[] args) {
        int a = 25;
        int b = 10;
        double x = 7.5;
        double y = 2.0;

        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;
        int rem = a % b;

        double dSum = x + y;
        double dDiff = x - y;
        double dProd = x * y;
        double dQuot = x / y;

        System.out.println("Integer Ops:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quot);
        System.out.println("Remainder: " + rem);

        System.out.println("\nFloating Point Ops:");
        System.out.println("Sum: " + dSum);
        System.out.println("Difference: " + dDiff);
        System.out.println("Product: " + dProd);
        System.out.println("Quotient: " + dQuot);
        
        a++;
        b--;
        System.out.println("\nUnary Ops:");
        System.out.println("Incremented a: " + a);
        System.out.println("Decremented b: " + b);
    }
}

