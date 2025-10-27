public class TypeCasting {
    public static void main(String[] args) {
        // Widening (automatic conversion from int to double)
        double num = 10;
        System.out.printf("The value is %f%n", num);

        // Narrowing (manual conversion from double to int)
        double price = 32.89;
        int result = (int) price;
        System.out.printf("The value is %d%n", result);
    }
}